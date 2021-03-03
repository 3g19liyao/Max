package LiKou;

public class MaxSubarraySumCircular {
    public static void main(String[] args) {
        System.out.println(maxSubarraySumCircular(new int[]{3,-2,-2,3}));
    }
    public static int maxSubarraySumCircular(int[] A) {
        /*int len = A.length;
        if(len == 0){
            return 0;
        }
        int res = A[0];
        for(int left = 0;left < len;left++){
            int num = A[left];
            res = Math.max(res,num);
            for(int right = left + 1;right < len+left;right++) {
                if(right >= len){
                    num += A[right - len];
                }else{
                    num += A[right];
                }
                res = Math.max(num,res);
            }
        }
        return res;*/
        int len = A.length;
        long sum = 0;
        long max = Integer.MIN_VALUE;
        for (int i=0;i<len;i++) {
            sum = Math.max(A[i], sum+A[i]);
            if (max < sum){
                max = sum;
            }
        }
        sum = 0;
        long all = 0;
        long min = Integer.MAX_VALUE;
        int s = 0;
        for (int i=0;i<len;i++) {
            if (A[i]<0){
                s++;
            }
            all += A[i];
            sum = Math.min(A[i], sum+A[i]);
            if (min > sum){
                min = sum;
            }
        }
        if (s == len) {
            return (int)max;
        } else {
            return (int) Math.max(max, all-min);
        }
    }
}
