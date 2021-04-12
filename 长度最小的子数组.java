package LiKou;

public class 长度最小的子数组 {
    public static void main(String[] args) {
        int[] a = new int[]{1,4,4};
        System.out.println(minSubArrayLen(4,a));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int res = Integer.MAX_VALUE;
        if(len == 0){
            return 0;
        }
        int left = 0;
        int end = 0;
        int num = 0;
        for(;end < len;end++){
            num += nums[end];
            while(num >= target){
                res = Math.min(res,end - left + 1);
                num -= nums[left];
                left++;
            }
        }
        if(res == Integer.MAX_VALUE){
            return 0;
        }else{
            return res;
        }
    }
}
