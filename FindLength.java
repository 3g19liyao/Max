package LiKou;

public class FindLength {
    public static void main(String[] args) {

    }

    public int findLength(int[] A, int[] B) {
        int len1 = A.length;
        int len2 = B.length;
        int[][] dp = new int[len1 + 1][len2 + 2];
        int res = 0;
        for(int i = len1 - 1;i >= 0;i--){
            for(int j = len2 - 1;j >= 0;j--){
                if(A[i] == B[j]){
                    dp[i][j] = dp[i+1][j+1] + 1;
                }else{
                    dp[i][j] = 0;
                }
                res = Math.max(res,dp[i][j]);
            }
        }
        return res;
    }
}
