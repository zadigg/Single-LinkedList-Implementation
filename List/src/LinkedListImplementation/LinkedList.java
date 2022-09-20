package LinkedListImplementation;

public class LinkedList {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node newNode = head;
			while (newNode.next != null) {
				newNode = newNode.next;
			}
			newNode.next = node;
		}
	}

	public void show() {
		Node newShowNode = head;
		while (newShowNode.next != null) {
			System.out.println(newShowNode.data);
			newShowNode = newShowNode.next;
		}
		System.out.println(newShowNode.data);
	}

	public void insertAtFirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		Node newNode = head;
		if (index == 0) {
			insertAtFirst(data);
		} else {
			for (int i = 0; i < index - 1; i++) {
				newNode = newNode.next;
			}
			node.next = newNode.next;
			newNode.next = node;
		}

	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node node = head;
			Node node1 = null;
			for (int i = 0; i < index - 1; i++) {
				node = node.next;
			}
			node1 = node.next;
			node.next = node1.next;
		}
	}

}
