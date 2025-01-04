package br.com.codeproblems.tree;

import br.com.codeproblems.tree.model.TreeNode;

public class BalancedTreeProblem110 {

    public static void main(String[] args) {
        System.out.println(BalancedTreeProblem110.isBalanced(new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)))));
    }

    public static boolean isBalanced(TreeNode root) {
        try {
            validateIfIsBalanced(root);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static int validateIfIsBalanced(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = root.left != null ? 1 + validateIfIsBalanced(root.left) : 0;
        int right = root.right != null ? 1 + validateIfIsBalanced(root.right) : 0;
        if(Math.abs(left - right) > 1) {
            throw new RuntimeException("Not balanced tree");
        }
        return Math.max(left, right);
    }
}
