package com.wipro.ass;

public class BinaryTreeNode { 
	int data; 
	BinaryTreeNode left, right = null; 
	BinaryTreeNode(int data) { 
		this.data = data; 
		left = right = null; 
	} 
	
	void inorderTraversal(BinaryTreeNode node) 
	{ 
		if (node != null) 
		{ 
			inorderTraversal(node.left); 
			System.out.print(node.data + " "); 
			inorderTraversal(node.right); 
		} 
	}
} 
