package LiKou;

import java.util.*;

public class PermuteUnique {



    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        List<List<Integer>> lists = permuteUnique(nums);
        System.out.println(lists);
    }

    /*public static List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        huisu(nums,0,list,lists);
        return lists;
    }

    public static void huisu(int[] nums, int index , List<Integer> list, List<List<Integer>> lists){

        if(list.size() ==  nums.length){
            List<Integer> list1 = new ArrayList<>(list);
            if(lists.contains(list1)){
                return ;
            }else{
                lists.add(list1);
            }
        }
        for(int i = index ; i < index + nums.length - list.size(); i++){
            if(i >= nums.length){
                list.add(nums[i - nums.length]);
                huisu(nums,index+1,list,lists);
                System.out.println(nums[i - nums.length]+"..."+list);
                list.remove(list.size()-1);
            }else{
                list.add(nums[i]);
                huisu(nums,index+1,list,lists);
                list.remove(list.size()-1);
            }
        }
    }*/
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        int[] remember = new int[0];
        remember = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        backtrack(lists, nums, remember, list);
        return lists;
    }

    public static void backtrack(List<List<Integer>> lists, int[] nums, int[] remember, List<Integer> list) {
        if (list.size() == nums.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
        if (remember[i] == 1 || (i > 0 && remember[i - 1] == 0 && nums[i - 1] == nums[i])) {
        continue;
        }
        remember[i] = 1;
        list.add(nums[i]);
        backtrack(lists, nums, remember, list);
        list.remove(list.size() - 1);
        remember[i] = 0;
        }
    }
}
