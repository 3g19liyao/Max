package LiKou;


import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {
    public static void main(String[] args) {

    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> list = new ArrayList<>();
        postorderTree(root,list);
        List<TreeNode> p1 = find(list,p);
        List<TreeNode> p2 = find(list,q);
        int len1 = p1.size();
        int len2 = p2.size();
        if(len1 < len2){
            for(TreeNode node : p1){
                if(p2.contains(node)){
                    return node;
                }
            }
        }else{
            for(TreeNode node : p2){
                if(p1.contains(node)){
                    return node;
                }
            }
        }
        return null;
    }
    public static void postorderTree(TreeNode node , List<TreeNode> list){
        if(node != null){
            postorderTree(node.left,list);
            postorderTree(node.right,list);
            list.add(node);
        }
    }
    public static List<TreeNode> find(List<TreeNode> list,TreeNode p){
        TreeNode node = p;
        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(node);
        for(TreeNode node1 : list){
            if(node1.left == node || node1.right == node){
                node = node1;
                nodeList.add(node);
            }
        }
        return nodeList;
    }
}
