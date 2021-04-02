package LiKou;

import java.util.ArrayList;
import java.util.List;

public class Partition {
    public static void main(String[] args) {

    }
    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        huisu(res, s,  new ArrayList<String>());
        return res;
    }
    private static void huisu(List<List<String>> res, String s, ArrayList<String> tmp) {
        if (s == null || s.length() == 0){
            res.add(new ArrayList<>(tmp));
            return ;
        }
        for (int i = 1; i <= s.length(); i++) {
            if (isHuiWen(s.substring(0, i))) {
                tmp.add(s.substring(0, i));
                huisu(res, s.substring(i, s.length()), tmp);
                tmp.remove(tmp.size() - 1);
            }
        }
    }

    private  static boolean isHuiWen(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
