package Linkedlist;
public class SinglyLinkedList {
    // Define the head node
    Node1 head;

    // Constructor to initialize the linked list
    SinglyLinkedList() {
        this.head = null;
    }

    // Method to insert a node at a specific position
    public void insertAtPos(int toInsert, int pos) {
        Node1 newNode = new Node1(toInsert);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node1 current = head;
        for (int i = 1; i < pos - 1; i++) {
            if (current == null) {
                System.out.println("Index out of bound!");
                return;
            }
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Method to delete a node after a specific position
    public void deleteAfterNode(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node1 current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null || current.next == null) {
                System.out.println("Index out of bound!");
                return;
            }
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Index out of bound");
            return;
        }
        current.next = current.next.next;
    }

    // Overloaded method to delete a node after a specific node
    public void deleteAfterNode(Node1 value) {
        if (value == null || value.next == null) {
            System.out.println("Index out of bound");
            return;
        }
        Node1 current = head;
        while (current != null && current != value) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("No node to delete");
            return;
        }
        current.next = current.next.next;
    }

    // Method to search for a node with specific data and return its position
    int searchNode(int data) {
        Node1 current = head;
        int position = 1;
        while (current != null) {
            if (current.value == data) {
                return position;
            }
            position++;
            current = current.next;
        }
        return -999;  // Return -999 if the node is not found
    }

    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();

        // Insert nodes at different positions
        ll.insertAtPos(3, 1);
        ll.insertAtPos(5, 2);
        ll.insertAtPos(7, 3);
        ll.insertAtPos(9, 4);

        // Print the position of node with value 5
        System.out.println("Position of node with value 5: " + ll.searchNode(5));  // Output: 2

        // Print the position of node with value 9
        System.out.println("Position of node with value 9: " + ll.searchNode(9));  // Output: 4

        // Delete the node at position 2
        ll.deleteAfterNode(1);
        System.out.println("Position of node with value 5 after deletion: " + ll.searchNode(5));  // Output: -999 (node deleted)

        // Insert node at position 2
        ll.insertAtPos(4, 2);
        System.out.println("Position of node with value 4: " + ll.searchNode(4));  // Output: 2

        // Delete the node after node with value 3
        Node1 node = ll.head;
        ll.deleteAfterNode(node);
        System.out.println("Position of node with value 4 after deletion: " + ll.searchNode(4));  // Output: -999 (node deleted)
    }
}
