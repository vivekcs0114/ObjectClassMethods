package com.avalia.example;

public class LinkedListInsertion {
	int data;
	LinkedListInsertion next;

	LinkedListInsertion() {
		this.next = null;
	}

	public static void main(String[] args) {
		LinkedListInsertion n1 = new LinkedListInsertion();//first node
		n1.next = new LinkedListInsertion();//second node
		n1.next.next = new LinkedListInsertion();//third node
		n1.data = 10;
		n1.next.data = 20;
		n1.next.next.data = 30;
		while (n1 != null) {
			if(n1.data==10){
				LinkedListInsertion t=n1.next;
				n1.next=new LinkedListInsertion();//fourth node(new node Insertion)
				n1.next.data=40;
			    n1.next.next=t;
			}
			
			System.out.print("\t-->" + n1.data);
			n1 = n1.next;
		}
	}
}
