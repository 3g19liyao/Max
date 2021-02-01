package LiKou;

import com.sun.org.apache.xerces.internal.xs.ShortList;
import com.sun.org.apache.xerces.internal.xs.XSException;

import java.util.*;

public class GrayCode {
    static List<Integer> lists = new ArrayList<>();
    public static void main(String[] args) {
        lists = grayCode(2);
        System.out.println(lists);
    }
    public static List<Integer> grayCode(int n) {
        if (n == 0) {
            return Collections.singletonList(0);
        }
        List<Integer> result = new ArrayList<>();
        backtrack(result, n, 1, 0, 1);
        backtrack(result, n, 1, 1, 0);
        return result;
    }
    private static void backtrack(List<Integer> result, int n, int index, int num, int x) {
        if (n == index) {
            result.add(num);
            return ;
        }
        if (x == 1) {
            backtrack(result, n, index + 1, num << 1, 1);
            backtrack(result, n, index + 1, (num << 1) + 1, 0);
        } else {
            backtrack(result, n, index + 1, (num << 1) + 1, 1);
            backtrack(result, n, index + 1, num << 1, 0);
        }
    }
}
