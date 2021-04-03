package LiKou;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }
    public static List<Integer> partitionLabels(String S) {
        int len = S.length();
        List<Integer> list = new ArrayList<>();
        if(len ==0){
            return list;
        }
        StringBuilder builder = new StringBuilder();
        int left = 0;
        while(true){
            if(left == len){
                break;
            }
            char a = S.charAt(left);
            int right = S.lastIndexOf(a);
            for(int i = left; i <= right;i++){
                int t = S.lastIndexOf(S.charAt(i));
                right = Math.max(t,right);
            }
            list.add(right - left + 1);
            left = right+1;
        }
        return list;
    }
}
