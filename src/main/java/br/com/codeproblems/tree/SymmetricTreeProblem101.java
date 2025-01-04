package br.com.codeproblems.tree;

public class SymmetricTreeProblem101 {
    public static void main(String[] args) {
        System.out.println(SameTreeProblem100.isSameTree(new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3))), null));
    }

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    private static boolean isSymmetric(final TreeNode left, final TreeNode right){
        if(left == null || right == null) {
            return left == null && right == null;
        }
        if(left.val != right.val) {
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
