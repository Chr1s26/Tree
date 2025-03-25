package binarytreeinordertraversal;

import java.util.ArrayList;
import java.util.List;

public class InorderTraverseAlgorithm {
    public static List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        InOrderTraverse(root);
        return list;
    }
    public void InOrderTraverse(TreeNode root) {
       if(root == null){
           return;
       }

       InOrderTraverse(root.left);
       list.add(root.val);
       InOrderTraverse(root.right);
    }


}
