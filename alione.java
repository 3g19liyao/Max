package LiKou;

import java.util.Arrays;
import java.util.Scanner;

public class alione {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextLong();
        }
        System.out.println(Arrays.toString(fun(n, c, arr)));
    }

    private static long[] fun(int n,int c,long[] arr) {
        if(n == 0 || c == 0){
            return new long[n];
        }
        long num = c;
        for (int i = 0;i < n;i++){
            if(num >= arr[i]){
                num = num + c - arr[i];
            }else{
                arr[i] = num;
                num = c;
            }
        }
        return arr;
    }
}
