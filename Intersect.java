package LiKou;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Intersect {
    public static void main(String[] args) {
        System.out.println(intersect(new int[]{1,2,5,4,8,6,3},new int[]{5,5,5,4,7,8,9}));
    }

    public static int[] intersect(int[] nums1,int[] nums2){
        int len1 = nums1.length;
        int len2 = nums2.length;
        if(len1 == 0 || len2 == 0){
            return new int[0];
        }
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int num : nums1){
            int sum = hashMap.getOrDefault(num,0)+1;
            hashMap.put(num,sum);
        }
        int length = Math.min(len1, len2);
        int[] res = new int[length];
        int index = 0;
        for(int num : nums2){
            int sum = hashMap.getOrDefault(num,0);
            if(sum > 0){
                res[index] = num;
                index++;
                hashMap.put(num,sum - 1);
            }
        }
        for(int num : res){
            System.out.print(num+"   ");
        }
        return  Arrays.copyOfRange(res, 0, index);
    }
}
