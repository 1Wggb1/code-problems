package br.com.codeproblems.linkedlist.model;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public boolean hasNext(){
        return this.next != null;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
