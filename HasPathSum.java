package LiKou;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class HasPathSum {
    public static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {

    }
    public static boolean hasPathSum(TreeNode root, int sum) {

        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            list.add(root.val);
        }
        huisu(root.left,root.val);
        huisu(root.right,root.val);

        if(list.contains(sum)){
            return true;
        }else{
            return false;
        }
    }
    public static void huisu(TreeNode node2 , int num){
        if(node2 == null){
            return ;
        }else{
            int sum = num + node2.val;
            huisu(node2.left,sum);
            huisu(node2.right,sum);
            if(node2.left == null && node2.right == null){
                list.add(sum);
            }
        }
    }
}
