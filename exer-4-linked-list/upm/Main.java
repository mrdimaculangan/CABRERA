package upm;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linked List Operations:");

        LinkedList list = new LinkedList();

        // Add nodes to the list
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);

        // Print the list
        System.out.println("List after adding nodes:");
        list.printList();

        // Delete a node
        list.deleteNode(20);

        // Print the list after deletion
        System.out.println("List after deleting node with value 20:");
        list.printList();
    }
}