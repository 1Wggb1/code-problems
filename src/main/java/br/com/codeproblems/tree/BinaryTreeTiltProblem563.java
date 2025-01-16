package br.com.codeproblems.tree;

import br.com.codeproblems.tree.model.TreeNode;

public class BinaryTreeTiltProblem563 {
    public int findTilt(TreeNode root) {
        final TiltState tiltState = new TiltState();
        doFindTilt(root, tiltState);
        return tiltState.getTotal();
    }

    private static class TiltState {
        private int total;

        public TiltState() {
            this.total = 0;
        }

        public int getTotal() {
            return total;
        }

        public void updateTotal(int value){
            total += value;
        }
    }

    private static int doFindTilt(final TreeNode node, final TiltState tiltState) {
        if(node == null){
            return 0;
        }
        final int left = doFindTilt(node.left, tiltState);
        final int right = doFindTilt(node.right, tiltState);
        tiltState.updateTotal(Math.abs(left - right));
        return node.val + left + right;
    }
}
