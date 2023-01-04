package assignment;
import java.util.*;


// node cannot exist without linkedlist
// so we will make a custom node class as inner class to the ll class


public class Nodeclass {
//every node is an object of the node class, so it will contain data and reference to the next node, so ref to node object
	static Node head;
	 // we will have reference to head node from beginning
	static class Node{
		Node new_node;
		int data;
		Node n;  // reference to another node using the class Node
		
		Node(int data){  // constructor of Node class, it takes only data coz the n value always points to next node
			this.data = data;
			this.n = null; // we initialise all n values to null first, then establish connection
			
		}
		
			
			
	}	
		

public static void display() {
	Node temp = head;  // we take a temp node that can store the value of head, , 
	
	while(temp !=null) {  // then if it is not null, as in it's address value is not null as well
		System.out.print(temp.data + " ");// then we print the data and point to next node.
		temp = temp.n;
		
	}
}
	public static void addFirst() {  // adding a node at the `beginning
		int [] data = {0,4,5,6,6};
		
		if(head == null) {
			Node new_node = head;
		}
		for (int i:data) {
		Node new_node = new Node(i);
		new_node.n = head;
		head = new_node;
		}
	}
	public static void addLast(int [] arr) {
		int [] data_last = arr;
		if(head == null) {
			Node new_node = head;
		return;
		}
		for (int j:data_last) {
			Node new_node = new Node(j);
			new_node.n = null;
			
			Node temp = head;
			while(temp.n!=null) {
				temp = temp.n;
			}
			temp.n = new_node;
			
			
		}             
	}
	public static void addMiddle(int [] dm, Node prev) {
		
		for (int k:dm) {
			Node new_node = new Node(k);
			new_node.n = prev.n;
			prev.n = new_node;
		}
	}
	public static void delNode(int target) {
		Node temp = head;
		Node prev = head;
		if(temp.data == target && head !=null) {
			head = temp.n; // now head points to the node next to the target node. if we want we can remove the first node 
			temp.n = null;	
		}
		while(temp.data !=target) {
				prev = temp;
				temp = temp.n;
			}
			prev.n = temp.n;
			temp.n = null;
		
		
		
	}
public static void main(String [] args) {
		
		head = new Node(1);
		Node second = new Node(2);
		Node three = new Node(3);
		int [] arr1 = {10,11,12};
		int [] data_middle = {25,26};
		head.n = second;// establishing connection between two nodes
		second.n = three;
		addFirst();
		addLast(arr1);
		addMiddle(data_middle, three.n);
		
		delNode(6);
		display();
//		System.out.println(head.data + " "+ head.n);
//		
//		System.out.println(three.data + " "+ three.n);
	}

}