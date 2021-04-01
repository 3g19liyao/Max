package LiKou;

public class NumRollsToTarget {
    public static void main(String[] args) {
        System.out.println(numRollsToTarget(2, 5, 10));
    }

    public static int numRollsToTarget(int d, int f, int target) {
        int[][] str = new int[d + 1][target + 1];
        str[1][0] = 0;
        for (int i = 1; i < f + 1; i++) {
            if (i > target) {
                break;
            } else {
                str[1][i] = 1;
            }
        }

        for (int i = 2; i <= d; i++) {
            for (int j = 1; j <= target; j++) {
                str[i][j] = str[i][target-j];
            }
        }
        return str[d][target];
    }
    /*private static final int MOD = 1000000007;
    public static int numRollsToTarget(int d, int f, int target) {
        int[][] dp = new int[d+1][f+1];
        int min = Math.min(f, target);
        for (int i = 1; i <= min; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= d; i++) {
            for (int j = i; j <= target; j++) {
                for (int k = 1; j - k >= 0 && k <= f; k++) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - k]) % MOD;
                }
            }
        }
        return dp[d][target];
    }*/
}