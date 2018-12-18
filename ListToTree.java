package com.wipro.ass;
//Java program to create complete Binary Tree from its Linked List 
//representation 

import java.util.Collections;
import java.util.LinkedList;

public class ListToTree { 

	// Driver program to test above functions 
	public static void main(String[] args) 
	{ 
		LinkedList<Integer> list = new LinkedList<>(); 
		list.push(35); 
		list.push(30); 
		list.push(25); 
		list.push(65); 
		list.push(12); 
		list.push(40);
		Collections.sort(list);
		BinaryTreeNode node = convertList2Binary(list); 

		System.out.println("Inorder Traversal of the"+ 
				" constructed Binary Tree is:"); 
		node.inorderTraversal(node); 
	} 

	static BinaryTreeNode convertList2Binary(LinkedList<Integer> list) {
		BinaryTreeNode parent = null;
		BinaryTreeNode leftChild = null, rightChild = null;
		
		if(list != null && list.size() != 0) {
			switch (list.size()) {
			case 3:
				parent = new BinaryTreeNode(list.get(1));
				parent.left = new BinaryTreeNode(list.get(0)); 
				parent.right = new BinaryTreeNode(list.get(2)); 
				break;
			case 2:
				parent = new BinaryTreeNode(list.get(1));
				parent.left = new BinaryTreeNode(list.get(0));; 
				break;
			case 1:
				parent = new BinaryTreeNode(list.get(0));
				break;
			default:
				int middleIndex = (list.size() + 1)/2;
				LinkedList<Integer> lList = new LinkedList<>(list.subList(0, middleIndex - 1));
				LinkedList<Integer> rList = new LinkedList<>(list.subList(middleIndex + 1, list.size()));

				Integer data = list.get(middleIndex);
				parent = new BinaryTreeNode(data);

				leftChild = convertList2Binary(lList); 
				rightChild = convertList2Binary(rList); 

				parent.left = leftChild; 
				parent.right = rightChild; 
				break;
			}
		} 
		return parent; 
	} 
} 
