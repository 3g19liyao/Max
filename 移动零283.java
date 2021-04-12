package LiKou;

import java.util.ArrayList;
import java.util.List;

public class 移动零283 {
    public static void main(String[] args) {

    }

    public void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i < nums.length;i++){
            if(nums[i] == 0){                       //存为0的下标
                list.add(i);
            }else{
                if(!list.isEmpty()){
                    int index = list.get(0);
                    nums[index] = nums[i];
                    nums[i] = 0;
                    list.remove(0);
                    list.add(i);
                }
            }
        }
    }


}
