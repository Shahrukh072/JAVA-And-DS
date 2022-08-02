package trees;

import java.util.Scanner;

public class TreeTest {
	
	public static TreeNode<Integer> takeInput() throws QueueEmptyException{
		Scanner s = new Scanner(System.in);
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Enter the root data");
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> front = pendingNodes.dequeue();
			System.out.println("Enter the no of children for: " + front.data);
			int numChild = s.nextInt();
			for(int i = 0; i<numChild; i++) {
				System.out.println("Enter the " + i + "th child data for:" + front.data);
				int childData = s.nextInt();
				TreeNode<Integer> childNode = new TreeNode<>(childData);
				front.children.add(childNode);
				pendingNodes.enqueue(childNode);
			}
		}
		return root;
	}
	
	public static int numberOfNodes(TreeNode<Integer> root) {
		int count = 1;
		for(int i= 0; i<root.children.size(); i++) {
			int childCount = numberOfNodes(root.children.get(i));
			count += childCount;
		}
		return count;
	}
	
	public static void printTree(TreeNode<Integer> root ) {
		
		// special case not base case
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + ": ");
		for(int i =0; i < root.children.size(); i++) {
			System.out.print(root.children.get(i).data + " ");			
		}
		System.out.println();
		for(int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTree(child);
		}
	}

	public static void main(String[] args) throws QueueEmptyException{
		
//		TreeNode<Integer> root = new TreeNode<>(4);
//		TreeNode<Integer> node1 = new TreeNode<>(2);
//		TreeNode<Integer> node2 = new TreeNode<>(3);
//		TreeNode<Integer> node3 = new TreeNode<>(1);
//		TreeNode<Integer> node4 = new TreeNode<>(5);
//		TreeNode<Integer> node5 = new TreeNode<>(6);
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		
//		node2.children.add(node4);
//		node2.children.add(node5);
		TreeNode<Integer> root = takeInput();
		printTree(root);
//		System.out.println(numberOfNodes(root));
	}

}
