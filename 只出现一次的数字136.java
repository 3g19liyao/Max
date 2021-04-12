package LiKou;

public class 只出现一次的数字136 {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0;i < nums.length;i++){
            res = res^nums[i];
        }
        return res;
    }

}
