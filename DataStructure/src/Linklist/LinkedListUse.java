package Linklist;

import java.util.Scanner;

class DoubleNode{
	Node<Integer> head;
	Node<Integer> tail;
	DoubleNode(){
		
	}
	DoubleNode(Node<Integer> head, Node<Integer> tail){
		this.head = head;
		this.tail = tail;
	}
}

public class LinkedListUse {
	public static Node<Integer> CreateLinkedList(){
		Node<Integer>n1 = new Node<>(10);
		Node<Integer>n2 = new Node<>(20);
		Node<Integer>n3 = new Node<>(30);
		Node<Integer>n4 = new Node<>(40);
		n1.next = n2;
//		System.out.println(" n1 "+ n1 + " data "+ n1.data + " next " + n1.next);
		n2.next = n3;
//		System.out.println(" n2 "+ n2 + " data "+ n2.data + " next " + n3.next);
		n3.next = n4;
//		System.out.println(" n3 "+ n3 + " data "+ n3.data + " next " + n3.next);
//		System.out.println(" n4 "+ n4 + " data "+ n4.data + " next " + n4.next);
		return n1;
	}
	public static void print(Node<Integer> head) {
//		System.out.println(" print " + head);
		Node<Integer> temp = head;
		while(temp != null) {
     	System.out.print(temp.data +" ");
     	temp = temp.next;
		}
		System.out.println();
//		temp = head;
//		System.out.println(head.next);
//		System.out.println(head.next.data);
//		System.out.println(head.next.next.data);
		
	}
	public static int length(Node<Integer> head) {
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		} 
		return count;
	}
	public static void increment(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
		temp.data++;
		temp = temp.next;
		}     
	}
	 
	public static Node<Integer> takeInput(){

		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null, tail = null;
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null) {
				head = currentNode;
				tail = currentNode;
			}else {
//				Node<Integer> tail = head;
//				while(tail.next != null) {
//					tail = tail.next;
//				}
				tail.next = currentNode;
				tail = currentNode;
			}		
			data = s.nextInt();
		}
		return head;
	}

	public static Node<Integer> insert(Node<Integer> head, int elem, int pos) {
		Node<Integer> NodeToBeInserted = new Node<Integer>(elem);
		if(pos == 0) {
			NodeToBeInserted.next = head;
	//		head = NodeToBeInserted;
			return NodeToBeInserted;
		}else {
		int count = 0;
		Node<Integer> prev = head;
		while(count < pos -1 && prev != null) {
			count++;
			prev = prev.next;	
		}
		if(prev != null) {
		NodeToBeInserted.next =prev.next;
		prev.next = NodeToBeInserted;
	}
		return head;
	}
	
	}
	
	public static void printR(Node<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printR(head.next);
	//	System.out.print(head.data + " ");      // reverse the LinkList
	}
	
	public static Node<Integer> insertR(Node<Integer> head, int elem, int pos){
		if(head == null && pos >0) {
			return head;
		}
		if(pos == 0) {
			Node<Integer> newNode = new Node<>(elem);
			newNode.next = head;
			return newNode;
		}else {
//			Node<Integer> smallerHead = insertR(head.next, elem, pos -1);
//     		head.next = smallerHead;
			head.next = insertR(head.next, elem, pos -1);
			return head;
		}
	}
	
	public static Node<Integer> reverseR(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> smallHead = reverseR(head.next);
		Node<Integer> tail = smallHead;
		while(tail.next != null) {
			tail = tail.next;
		}
		tail.next = head;
		head.next = null;
		return smallHead;
	}
	
	public static DoubleNode reverseRBetter(Node<Integer> head) {
		DoubleNode ans;
		if(head == null || head.next == null) {
			ans = new DoubleNode(head, head);
//			ans.head = head;
//    		ans.tail = head;
			return ans;
		}
		//this double node will have both head and tail of reverse LL
		DoubleNode smallAns = reverseRBetter(head.next);
		smallAns.tail.next = head;
		head.next = null;
		ans = new DoubleNode();
		ans.head = smallAns.head;
		ans.tail = head;
		return ans;
	}
	public static Node<Integer> reverseRBetter1(Node<Integer> head){
		DoubleNode ans = reverseRBetter(head);
		return ans.head;
	}
	
	public static Node<Integer> reverseRBest(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> smallHead = reverseRBest(head.next);
		Node<Integer> reversedTail = head.next;
		reversedTail.next = head;
		head.next = null;
		return smallHead;
	}
	
	public static Node<Integer> midpoint(Node<Integer> head){
		Node<Integer> slow = head, fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	
	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2){
		
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		
		Node<Integer> t1 = head1, t2 = head2;
		Node<Integer> head = null, tail = null;
		if(t1.data <= t2.data) {
			head = t1;
			tail = t1;
			t1 = t1.next;
		}else {
			head = t2;
			tail = t2;
			t2 = t2.next;
		}
		while(t1 != null && t2 != null) {
			if(t1.data <= t2.data) {
				tail.next = t1;
				tail = t1;
				t1 = t1.next;
			}else {
				tail.next = t2;
				tail = t2;
				t2 = t2.next;
			}
		}
		// one list is over
		if(t1 != null) {
			// first list is remaining
			tail.next = t1;
		}else {
			tail.next = t2;
		}
		return head;
	}
	
	
	
	
	
	public static void main(String[] args) {
//		Node<Integer> head = takeInput(); //CreateLinkedList(); 
		Node<Integer> head1 = takeInput();
		Node<Integer> head2 = takeInput();
		Node<Integer> head = merge(head1, head2);
		print(head);
//		Node<Integer> mid = midpoint(head);
//		System.out.println(mid.data);
//		head = insert(head, 80, 0);
//    	increment(head);
//		head = insertR(head, 20, 2);
//		head = reverseR(head);
//		DoubleNode ans = reverseRBetter(head);
//		head = reverseRBest(head);
//		printR(head);
		
//		System.out.println(length(head));
		
//		Node <Integer>n1 = new Node<>(10);
//		System.out.println(n1.data);
//		System.out.println(n1.next);

	}

}
