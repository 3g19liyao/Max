package LiKou;

public class NumTrees {
    public static void main(String[] args) {
        int n=5;
        int num=numTrees(n);
    }
    public static int numTrees(int n) {
        int[] f=new int[n+1];
        f[0]=1;
        f[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                f[i]+=f[j]*f[i-1-j];
            }
        }
        return f[n];
    }
}
