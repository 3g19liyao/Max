package LiKou;

import java.util.Arrays;
import java.util.List;

public class MinimumTotal {
    public static void main(String[] args) {

    }
    public static int minimumTotal(List<List<Integer>> triangle){
        int n = triangle.size();
        int[][] dp = new int[n + 1][n + 1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= triangle.get(i - 1).size(); j++){
                dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i - 1).get(j - 1);
            }
        }
        int res = dp[1][1];
        for(int i = 1; i <= n; i++){
            res = Math.min(res, dp[n][i]);
        }
        return res;
    }
}
