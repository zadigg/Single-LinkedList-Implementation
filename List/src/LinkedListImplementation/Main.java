package LinkedListImplementation;

public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(125);
		list.insert(35);
		list.insertAtFirst(66);
		list.insertAt(2, 6);
		list.insertAt(0, 55);
		list.deleteAt(2);
		list.show();
		
		Node startNode = new Node();
		startNode.data = 1;
		Node next = new Node();
		next.data = 2;
		startNode.next = next;
		Node thirdNode = new Node();
		thirdNode.data = 3;
		next.next = thirdNode;
		
		
	}
}
