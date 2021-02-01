package LiKou;

import java.util.*;

/*
* 输入：nums = [1,2,3,4]
  输出：false
  解释：序列中不存在 132 模式的子序列。
* */
public class find132pattern {

    public static void main(String[] args) {
        int[] nums = new int[]{1,0,1,-4,-3};
        System.out.println(find132pattern(nums));
    }

    public boolean find132pattern2(int[] nums) {
        int n = nums.length;
        Deque<Integer> candidateK = new LinkedList<Integer>();
        candidateK.push(nums[n - 1]);//最后一个值
        int maxK = Integer.MIN_VALUE;//2候选值的最大值
        for (int i = n - 2; i >= 0; --i) {
            if (nums[i] < maxK) {
                return true;
            }
            while (!candidateK.isEmpty() && nums[i] > candidateK.peek()) {
                maxK = candidateK.pop();
            }
            if (nums[i] > maxK) {
                candidateK.push(nums[i]);
            }
        }
        return false;
    }

    public boolean find132pattern1(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;
        }
        // 左侧最小值
        int leftMin = nums[0];
        // 右侧所有元素
        TreeMap<Integer, Integer> rightAll = new TreeMap<Integer, Integer>();
        for (int k = 2; k < n; ++k) {
            rightAll.put(nums[k], rightAll.getOrDefault(nums[k], 0) + 1);
        }
        for (int j = 1; j < n - 1; ++j) {
            if (leftMin < nums[j]) {
                Integer next = rightAll.ceilingKey(leftMin + 1);
                if (next != null && next < nums[j]) {
                    return true;
                }
            }
            leftMin = Math.min(leftMin, nums[j]);
            rightAll.put(nums[j + 1], rightAll.get(nums[j + 1]) - 1);
            if (rightAll.get(nums[j + 1]) == 0) {
                rightAll.remove(nums[j + 1]);
            }
        }
        return false;
    }
    public static boolean find132pattern(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        while(!list.isEmpty()){
            int min = nums[list.get(0)];
            int maxIn = list.get(0);
            int minIn = list.get(0);
            int max = nums[list.get(0)];
            int mid = nums[list.get(0)];
            for(int i = list.get(0);i<nums.length;i++){
                if(nums[i] < min){
                    min = nums[i];
                    minIn = list.get(0);
                }
                if(nums[i] > max){
                    max = nums[i];
                    maxIn = list.get(0);
                }
                if(minIn > maxIn){
                    break;
                }
                if(min < nums[i] && max > nums[i]){
                    System.out.println(min+"   "+max+"   "+nums[i]);
                    return true;
                }
            }
            list.remove(0);
        }
        return false;
    }
}
