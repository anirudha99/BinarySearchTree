package com.bst;

public class MyBinaryTreeTest {

	public static void main(String[] args) {
		MyBinaryTree<Integer> myBinaryTree=new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		System.out.println("size of tree is "+myBinaryTree.getSize());
	}

}