package br.com.codeproblems.tree;

import br.com.codeproblems.tree.model.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePostOrderTraversal145 {
    public static void main(String[] args) {
        System.out.println(BinaryTreePostOrderTraversal145.postorderTraversal(new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)))));
    }

    public static List<Integer> postorderTraversal(final TreeNode root) {
        final List<Integer> result = new LinkedList<>();
        doPostOrderTraversal(root, result);
        return result;
    }

    private static void doPostOrderTraversal(final TreeNode node, final List<Integer> result) {
        if(node == null) {
            return;
        }
        doPostOrderTraversal(node.left, result);
        doPostOrderTraversal(node.right, result);
        result.add(node.val);
    }
}
