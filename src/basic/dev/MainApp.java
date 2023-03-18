package basic.dev;

import java.util.LinkedList;

public class MainApp {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		DoublyLinkedList doublelist = new DoublyLinkedList();
		doublelist.addLast(7);
		doublelist.addFirst(3);
		doublelist.display();
	}
}
