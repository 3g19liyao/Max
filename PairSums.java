package LiKou;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairSums {
    public static void main(String[] args) {
        System.out.print(pairSums(new int[]{2, 1, 8, 6, 5, 7, -1, 3, 5, 5},7));
    }
    /*
    输入: nums = [5,6,5,6], target = 11
    输出: [[5,6],[5,6]]
    */
    public static List<List<Integer>> pairSums(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int len = nums.length;
        for(int i = 0;i < len;i++){
            int num = nums[i];
            if(!map.isEmpty() && map.containsKey(target - num) && map.get(target - num) > 0){
                System.out.println(target - num+"..."+map.get(target - num));
                //if(map.get(target - num) > 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(num);
                    list.add(target - num);
                    lists.add(list);
                    map.put(target - num,map.get(target - num) - 1);
                //}else{
                //    map.put(num,map.get(num) + 1);
                //}
            }else{
                if(map.containsKey(num)){
                    map.put(num,map.get(num) + 1);
                }else{
                    map.put(num,1);
                }
            }
        }
        return lists;
    }
}
