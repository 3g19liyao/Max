package LiKou;

public class MinimumOperations {
    public static void main(String[] args) {
        System.out.println(minimumOperations("rrryyyrryyyrr"));
    }
    public static int minimumOperations(String leaves) {
        if(leaves.length()<3) {
            return 0;
        }
        int len = leaves.length();

        // r 为 0-i 变成r 需要的次数
        int[] r = new int[len];
        r[0] = (leaves.charAt(0)=='r' ? 0 : 1);
        for(int i=1;i<len;i++) {
            if(leaves.charAt(i)!='y') {
                r[i] = r[i-1];
            } else {
                r[i] = 1 + r[i-1];
            }
        }

        //  变量ry表示上一次变成 r*y*的形式的最小变化次数
        int ry = (leaves.charAt(0)=='r' ? 0 : 1);
        int res = Integer.MAX_VALUE;

        for(int i=1;i<len-1;i++) {
            char ch = leaves.charAt(i);
            if(ch=='y') {
                ry = Math.min(ry,r[i-1]);
            }
            if(ch=='r') {
                ry = Math.min(ry+1,r[i-1]+1);
            }
            res = Math.min(ry+r[len-1]-r[i],res);
        }
        return res;
    }
}
