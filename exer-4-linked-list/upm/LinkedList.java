package upm;

public class LinkedList {
    private Node head;

    // Constructor
    public LinkedList() {
        this.head = null;
    }

    // Add node to the list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    // Delete node by value
    public boolean deleteNode(int data) {
        if (head == null) {
            return false;
        }
        if (head.getData() == data) {
            head = head.getNext();
            return true;
        }
        Node current = head;
        while (current.getNext() != null && current.getNext().getData() != data) {
            current = current.getNext();
        }
        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
            return true;
        }
        return false;
    }

    // Print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}