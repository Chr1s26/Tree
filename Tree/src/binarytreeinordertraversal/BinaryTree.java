package binarytreeinordertraversal;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static TreeNode getPrebuiltTree() {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        root.right.right.right = new TreeNode(9);

        return root;
    }
}