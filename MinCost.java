package LiKou;

public class MinCost {
    public static void main(String[] args) {
         String s = "aaabaaa";
         int[] cost = new int[]{1,7,7,4,1,4,7};
         System.out.println(minCost(s,cost));
    }
    public static int minCost(String s, int[] cost) {
        int res = 0;
        int len = s.length();
        char[] str = s.toCharArray();
        for(int i = 0;i < len;i++){
            char c = str[i];
            int max = cost[i];
            int sum = cost[i];
            while(i + 1 < len && str[i + 1] == c){
                i++;
                sum += cost[i];
                max = Math.max(max,cost[i]);
            }
            if(sum > max){
                res += sum - max;
            }
        }
        return res;
    }
}
