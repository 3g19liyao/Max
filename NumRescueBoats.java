package LiKou;

import java.util.Arrays;

public class NumRescueBoats {
    public static void main(String[] args) {
        int[] people = new int[]{3,5,3,4};
        int limit = 5;
        System.out.println(numRescueBoats(people,limit));
    }
    /*public static int numRescueBoats(int[] people, int limit) {
        int res = 0;
        int[] arr = new int[limit+1];
        int len = people.length;
        for(int i = 0; i < len ;i++){
            for(int j = limit ; j>0;j++){
                if(arr[j] > 0){
                    arr[j]--;
                }else{
                    res++;
                    int a = limit - people[i];
                    if(a > 0){
                        arr[a]++;
                    }
                }
            }
        }
        return res;
    }*/
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int res = 0;
        while (left <= right) {
            res++;
            if (people[left] + people[right] <= limit){
                left++;
            }
            right--;
        }
        return res;
    }
}
