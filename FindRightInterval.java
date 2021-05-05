package LiKou;

import java.util.ArrayList;
import java.util.List;

public class FindRightInterval {
    public static void main(String[] args) {

    }
    public static int[] findRightInterval(int[][] intervals) {
        int len = intervals.length;
        int[] dp = new int[len];
        for(int i = 0;i < len;i++){
            int num = intervals[i][1];
            int sum = Integer.MAX_VALUE,flag = 0;
            dp[i] = -1;
            for(int j = 0;j < len;j++){
                if(j == i){
                    continue;
                }else if(intervals[j][0] == num){
                    dp[i] = j;
                    continue;
                }else if(intervals[j][0] > num){
                    int p = sum;
                    sum = Math.min(sum,intervals[j][0]);
                    if(p > sum){
                        dp[i] = j;
                    }
                }
            }
        }
        return dp;
    }
}
