package LiKou;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] num = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] arr = dailyTemperatures(num);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]);
    }
    public static int[] dailyTemperatures(int[] T){
        int len = T.length;
        int[] arr = new int[len];
        arr[len-1] = 0;
        for(int i = len-2;i>=0;i--){
            for(int j = i+1;j<len;j+=arr[j]){
                if (T[j] > T[i]) {
                    arr[i] = j - i;
                    break;
                } else if (arr[j] == 0) {
                    arr[i] = 0;
                    break;
                }
            }
        }
        return arr;
    }
}
