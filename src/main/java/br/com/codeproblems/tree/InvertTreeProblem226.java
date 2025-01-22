package br.com.codeproblems.tree;

import br.com.codeproblems.tree.model.TreeNode;

public class InvertTreeProblem226 {
    public static void main(String[] args) {
        System.out.println(InvertTreeProblem226.invertTree(new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)))));
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        doInvertTree(root);
        return root;
    }

    public static void doInvertTree(TreeNode root) {
        if(root == null) {
            return;
        }
        doInvertTree(root.left);
        doInvertTree(root.right);
        final TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
    }
}
