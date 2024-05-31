package Linkedlist;

public class Stack {
    Node1 top; // The top node of the stack

    // Constructor to initialize the stack
    public Stack() {
        this.top = null; // Initially, the stack is empty
    }

    // Method to push an element onto the stack
    public void push(int data) {
        Node1 newNode = new Node1(data);
        newNode.next = top; // Set the new node's next reference to the current top node
        top = newNode; // Update the top node to the new node
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1; // Return -1 if the stack is empty
        }
        int poppedData = top.value; // Store the value of the top node
        top = top.next; // Update the top node to the next node
        return poppedData; // Return the popped value
    }

    // Method to peek at the top element of the stack without removing it
    public int peek() {
        if (top == null) {
            System.out.println("Peek from empty stack");
            return -1; // Return -1 if the stack is empty
        }
        return top.value; // Return the value of the top node
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null; // Return true if the stack is empty, false otherwise
    }

    // Main method to demonstrate the stack operations
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10); // Push 10 onto the stack
        stack.push(20); // Push 20 onto the stack
        stack.push(30); // Push 30 onto the stack
        System.out.println(stack.peek());  // Output: 30 (top element)
        System.out.println(stack.pop());   // Output: 30 (pop top element)
        System.out.println(stack.pop());   // Output: 20 (pop top element)
        System.out.println(stack.isEmpty());  // Output: false (stack is not empty)
        System.out.println(stack.pop());   // Output: 10 (pop top element)
        System.out.println(stack.isEmpty());  // Output: true (stack is empty)
    }
}
