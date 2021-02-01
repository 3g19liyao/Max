package LiKou;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String s=")()())";
        int sum=longestValidParentheses(s);
        System.out.println(sum);
    }
    static public int longestValidParentheses(String s) {
        int len=s.length();
        int[] dp=new int[len+1];
        int maxLen=0;
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<=len;i++){
            if(s.charAt(i-1)=='('){
                dp[i]=0;
            }else{
                if(s.charAt(i-2)=='('){
                    dp[i]=dp[i-2]+2;
                }
                if(s.charAt(i-2)==')'){
                    if(s.charAt(i-2-dp[i-1])=='('){
                        dp[i]=dp[i-1]+2;
                    }else{
                        dp[i]=0;
                    }
                }
            }
            maxLen=Math.max(maxLen,dp[i]);
        }
        return maxLen;
    }
}
