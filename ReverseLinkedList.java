package com.wipro.ass;

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(2);
		head.next = new ListNode(3);
		head.next.next = new ListNode(4);
		head.next.next.next = new ListNode(5);
		head.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next = new ListNode(7);
		
		ListNode last = reverseList(head);
		
		while(last != null) {
			System.out.print(last.data);
			last = last.next;
		}
	}

	private static ListNode reverseList(ListNode head) {
		ListNode prev = null, next = null;
		ListNode curr = head;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}
