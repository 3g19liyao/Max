package LiKou;

import java.util.*;

public class MaxCoins {
    public static void main(String[] args) {
        int[] nums = new int[]{9,76,64,21,97,60};
        System.out.println(maxCoins(nums));
    }
    public static int maxCoins(int[] nums){
        int len = nums.length;
        int[] nums1 = new int[len-2];
        int max = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<len-1;i++){
            nums1[i-1] = nums[i];
            list.add(nums[i]);
        }
        Arrays.sort(nums1);
        for(int j=0;j<len-2;j++){
            System.out.println(list);
            int index = list.indexOf(nums1[j]);
            System.out.println(index);
            if(index == 0 && list.size() == 1){
                max = max + nums1[j]*nums[0]*nums[len-1];
            }else if(index == 0){
                max = max + nums1[j]*nums[0]*list.get(index+1);
            }else if(index == len-3){
                max = max + nums1[j]*list.get(index-1)*nums[len-1];
            }else if(index == list.size()-1){
                max = max + nums1[j]*list.get(index-1)*nums[len-1];
            }else{
                max = max + nums1[j]*list.get(index-1)*list.get(index+1);
            }
            list.remove(index);
        }
        max = max+nums[0]*nums[len-1]+Math.max(nums[0],nums[len-1]);
        return max;
    }
}
