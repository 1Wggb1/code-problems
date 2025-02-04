package br.com.codeproblems.linkedlist;

import br.com.codeproblems.linkedlist.model.ListNode;

public class LinkedListCycleProblem141SlowFastPointer {
    /*
        38, 9
        s,f
            s  f (out array)

        1 -> 3 -> 4 -> 5 <-> 6
        s,f
             s    f
                  s          f
                        s    f
                             s,f

         1 -> 2 -> 4 -> 5 -> 6 -> 7 -> 8
                         <-------------|
        s,f
              s    f
                   s         f
                        s               f
                             f, s
    */
    public static void main(String[] args) {
        System.out.println(LinkedListCycleProblem141SlowFastPointer.hasCycle(new ListNode(1, new ListNode(2, null))));

        ListNode node = new ListNode(3, null);
        ListNode head = new ListNode(2, node);
        ListNode cycleStart = new ListNode(-1, head);
        node.setNext(cycleStart);
        System.out.println(LinkedListCycleProblem141SlowFastPointer.hasCycle(new ListNode(1, head)));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        for(;fast != null && fast.hasNext();){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
