package binarytreeinordertraversal;

import static binarytreeinordertraversal.BinaryTree.getPrebuiltTree;

public class Test {

    public static void main(String[] args){
        TreeNode root = getPrebuiltTree();
        InorderTraverseAlgorithm inorderTraverseAlgorithm = new InorderTraverseAlgorithm();
        System.out.println(inorderTraverseAlgorithm.inorderTraversal(root));
    }

}
