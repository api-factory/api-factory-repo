package com.wipro.ass;

public class LengthOfList {

	public static void main(String[] args) {
		ListNode head = new ListNode(2);
		head.next = new ListNode(3);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);
		head.next.next.next.next.next = new ListNode(3);
		
		System.out.println(getLength(head));
	}

	private static int getLength(ListNode node) {
		int count = 0;
		
		while(node != null) {
			count++;
			node = node.next;
		}
		return count;
	}
}
