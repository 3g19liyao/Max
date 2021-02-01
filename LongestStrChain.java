package LiKou;

public class LongestStrChain {
    public static void main(String[] args) {
        System.out.println(waysToChange2(5));
    }
    public static int waysToChange2(int n) {
        int[] dp=new int[n+1];
        int[] coins={1,5,10,25};
        for(int i=0;i<=n;i++){
            dp[i]=1;
        }
        for(int i=1;i<4;i++){
            for(int j=1;j<=n;j++){
                if(j>=coins[i]){
                    dp[j]=(dp[j]+dp[j-coins[i]])%1000000007;
                }
            }
        }
        return dp[n];
    }
}
