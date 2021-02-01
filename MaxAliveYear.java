package LiKou;

public class MaxAliveYear {
    public static void main(String[] args) {

    }
    public static int maxAliveYear(int[] birth, int[] death) {
        int[] r = new int[101];
        for(int i = 0;i < birth.length;i++){
            r[birth[i]-1900] += 1;
            r[death[i]-1900+1] -= 1;
        }
        int p = 0;
        int max = 0;
        int res = 0;
        for(int i = 0;i < 101;i++){
            p += r[i];
            if(p > max){
                max = p;
                res = i + 1900;
            }
        }
        return res;
    }
}
