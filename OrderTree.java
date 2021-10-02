package LiKou;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class OrderTree {
    public static void main(String[] args) {

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrderList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.empty()) {
            while(root != null) {
                stack.push(root);
                preOrderList.add(root.val);
                root = root.left;
            }
            while(root == null && !stack.empty()) {
                root = stack.pop().right;
            }
        }
        return preOrderList;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrderList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.empty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            inOrderList.add(root.val);
            root = root.right;
        }
        return inOrderList;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrderList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while(root != null || !stack.empty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.peek();
            if(root.right == null || root.right == pre) {
                pre = root;
                postOrderList.add(stack.pop().val);
                root = null;
            }else {
                root = root.right;
            }
        }
        return postOrderList;
    }
}
