package br.com.codeproblems.tree;

import br.com.codeproblems.tree.model.TreeNode;

public class SameTreeProblem100 {
    public static void main(String[] args) {
        System.out.println(SameTreeProblem100.isSameTree(new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3))), null));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null){
            return p == null && q == null;
        }
        if(p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}