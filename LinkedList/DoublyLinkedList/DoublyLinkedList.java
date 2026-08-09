package LinkedList.DoublyLinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Node Creation
    static class Node {

        private Node next;
        private Node prev;
        private int data;

        // Constructor
        public Node(int data) {
            this.next = null;
            this.prev = null;
            this.data = data;
        }
    }

    // ================================
    // Insertion
    // ================================

    // Insert At Beggining
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Insert At Ending
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Insert At Specific Position (1-based indexing)
    public void insertAtSpecificPosition(int position, int data) {
        if (position < 1 || position > size + 1) {
            throw new IndexOutOfBoundsException("Invalid position: " + position);
        }
        if (position == 1) {
            insertAtHead(data);
            return;
        }
        if (position == size + 1) {
            insertAtTail(data);
            return;
        }

        Node prevNode = head;

        for (int i = 1; i < position - 1; i++) {
            prevNode = prevNode.next;
        }
        Node nextNode = prevNode.next;

        Node newNode = new Node(data);
        prevNode.next = newNode;
        newNode.prev = prevNode;

        nextNode.prev = newNode;
        newNode.next = nextNode;

        size++;
    }

    // ================================
    // Printing/Traversal
    // ================================

    // Forward Traversal
    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    // Backward Traversal
    public void backwardTraversal() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        Node curNode = tail;
        while (curNode != null) {
            System.out.print(curNode.data + "<-");
            curNode = curNode.prev;
        }
        System.out.println("null");
    }

    // ================================
    // Utility Functions
    // ================================

    // Get size.
    public int getSize() {
        return size;
    }

    // Check whether the LinkedList is empty.
    public boolean isEmpty() {
        return size == 0;
    }

    public int getHeadNodeData() {
        if (head != null) {
            return head.data;
        }
        throw new NoSuchElementException("List is empty");
    }

    public int getTailNodeData() {
        if (tail != null) {
            return tail.data;
        }
        throw new NoSuchElementException("List is empty");
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    // ================================
    // Searching
    // ================================

    // Return true if data found.
    public boolean searchData(int target) {
        Node currNode = head;
        while (currNode != null) {
            if (currNode.data == target) {
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }

    // Return position 1-based.
    public int findDataAtWhichPosition(int target) {
        Node currNode = head;
        int position = 1;
        while (currNode != null) {
            if (currNode.data == target) {
                return position;
            }
            currNode = currNode.next;
            position++;
        }
        return -1;
    }

    // ================================
    // Deletion
    // ================================

    // Delete First Element
    public void deleteHeadNode() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot delete from an empty list");
        }
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }
        Node nextNode = head.next;
        nextNode.prev = null;
        head.next = null;
        head = nextNode;
        size--;
    }

    // Delete Last Element.
    public void deleteTailNode() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot delete from an empty list");
        }
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }
        Node prevNode = tail.prev;
        prevNode.next = null;
        tail.prev = null;
        tail = prevNode;
        size--;
    }

    // Delete node from the position.
    public void deleteAtPosition(int position) {
        if (position < 1 || position > size) {
            throw new IndexOutOfBoundsException("Invalid position:" + position);
        }

        if (position == 1) {
            deleteHeadNode();
            return;
        }

        if (position == size) {
            deleteTailNode();
            return;
        }

        Node curNode = head;
        for (int i = 1; i < position; i++) {
            curNode = curNode.next;
        }
        Node prevNode = curNode.prev;
        Node nextNode = curNode.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        curNode.prev = null;
        curNode.next = null;
        size--;
    }

    // ================================
    // Updation
    // ================================

    // Update Value at given position.
    public void updateAtPosition(int position, int data) {
        if (isEmpty()) {
            throw new NoSuchElementException("List ios empty can't perform update operation");
        }
        if (position < 1 || position > size) {
            throw new IndexOutOfBoundsException("Invalid position:" + position);
        }

        Node currentNode = head;
        for (int i = 1; i < position; i++) {
            currentNode = currentNode.next;
        }
        currentNode.data = data;
    }

    // Update Old value with new given value.
    public boolean updateValue(int oldValue, int newValue) {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty can't perform update operation");
        }
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == oldValue) {
                currentNode.data = newValue;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
}
