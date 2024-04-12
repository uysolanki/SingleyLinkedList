package day25.collection.datastructure;

import java.util.Scanner;

public class SinglyLinkedList {
	public static void main(String[] args) {
		
		Node head=null;
		head=create(head);
		System.out.println("Display After Creation");
		display(head);
		head=addFirst(head);
		System.out.println("Display After Adding at first position");
		display(head);
		addLast(head);
		System.out.println("Display After Adding at Last position");
		display(head);
		addMid(head);
		System.out.println("Display After Adding at Middle position");
		display(head);
	}

	private static void addMid(Node head) {
		Node temp=head;
		int pos;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Position of New Node"); // Dom;
		pos=sc.nextInt();
		int i=1;
		while(i<pos-1)
		{
			temp=temp.next;
			i++;
		}
		
		System.out.println("Enter data for Middle Node"); // Bharat
		String name=sc.next();
		Node nn=new Node(name);
		
		nn.next=temp.next;
		temp.next=nn;
		
	}

	private static void addLast(Node head) {
		Node temp=head;
		while(temp.next!=null)
		{
		temp=temp.next;
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data for Last Nde"); // Dom;
		String name=sc.next();
		Node nn=new Node(name);
		
		temp.next=nn;
	}

	private static Node addFirst(Node head) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data for First Nde"); // Abhay;
		String name=sc.next();
		Node nn=new Node(name);
		nn.next=head;
		head=nn;
		return head;
	}

	private static void display(Node head) {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data +"->");
			temp=temp.next;
		}
		System.out.println("null");
	}

	private static Node create(Node head) 
	{
		int size;
		Node temp=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Linked List");  //10  1 if    9 else
		size=sc.nextInt();
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter data for Node "+ i); // Chris;
			String name=sc.next();
			Node nn=new Node(name);
			if(head==null)
			{
				temp=head=nn;
			}
			else
			{
				temp.next=nn;
				temp=temp.next;
			}
			
		}
	
		return head;
	}

}
