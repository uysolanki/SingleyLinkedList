package day25.collection.datastructure;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> students=new LinkedList();
		students.add("Alice");
		students.add("Ben");
		students.add("Chris");
		students.addFirst("Abhay");
		students.addLast("Dom");
		students.add(2, "Bharat");
		
		System.out.println(students);
	}

}
