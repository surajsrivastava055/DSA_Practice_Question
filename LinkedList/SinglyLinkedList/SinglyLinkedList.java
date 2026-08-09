package LinkedList.SinglyLinkedList;

/**
 * SinglyLinkedList
 */
public class SinglyLinkedList {

    private Node headNode;
    private Node trailNode;
    private int size;

    // Constructor
    public SinglyLinkedList() {
        this.headNode = null;
        this.trailNode = null;
        this.size = 0;
    }

    // Creating a Node
    static class Node {
        int data;
        Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ================================
    // Insertion
    // ================================

    // Insert At Beggining
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (headNode == null && trailNode == null) {
            headNode = newNode;
            trailNode = newNode;
        } else {
            newNode.next = headNode;
            headNode = newNode;
        }
        size++;
    }

    // Insert At Ending
    public void insertAtTrail(int data) {
        Node newNode = new Node(data);
        if (headNode == null && trailNode == null) {
            headNode = newNode;
            trailNode = newNode;
        } else {
            trailNode.next = newNode;
            trailNode = newNode;
        }
        size++;
    }

    // Insert At Specific position indexing starts from 1
    public void insertAtSpecificPosition(int position, int data) {

        if (position < 1 || position > size + 1) {
            System.out.println("Invalid Position hence can not insert node");
            return;
        }

        if (position == 1) {
            insertAtHead(data);
            return;
        }

        if (position == size + 1) {
            insertAtTrail(data);
            return;
        }

        Node newNode = new Node(data);
        Node prevNode = headNode;

        for (int i = 1; i < position - 1; i++) {
            prevNode = prevNode.next;
        }

        newNode.next = prevNode.next;
        prevNode.next = newNode;
        size++;
    }

    // ================================
    // Printing/Traversal
    // ================================

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        Node curNode = headNode;
        while (curNode != null) {
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.println();
    }

    // ================================
    // Utility Functions
    // ================================

    // Get size.
    public int getSize() {
        return size;
    }

    // Checking the LinkedList is empty or not.
    public boolean isEmpty() {
        return headNode == null;
    }

    public int getHeadNode() {
        if (headNode == null) {
            return -1;
        } else {
            return headNode.data;
        }
    }

    public int getTrailNode() {
        if (trailNode == null) {
            return -1;
        } else {
            return trailNode.data;
        }
    }

    public void clear() {
        headNode = null;
        trailNode = null;
        size = 0;
    }

    // ================================
    // Searching
    // ================================

    // Return true if data found.
    public boolean searchData(int target) {
        Node curNode = headNode;
        while (curNode != null) {
            if (curNode.data == target) {
                return true;
            } else {
                curNode = curNode.next;
            }
        }
        return false;
    }

    // Return position 1-based.
    public int findDataAtWhichPosition(int target) {
        Node curNode = headNode;
        int position = 1;
        while (curNode != null) {
            if (curNode.data == target) {
                return position;
            } else {
                curNode = curNode.next;
                position++;
            }
        }
        return -1;
    }

    // ================================
    // Deletion
    // ================================

    // Delete First Element
    public void deleteHeadNode() {
        if (isEmpty()) {
            System.out.println("As LinkedList is Empty hence not able to perform delete operation");
            return;
        }
        if (size == 1) {
            headNode = null;
            trailNode = null;
        } else {
            headNode = headNode.next;
        }
        size--;
    }

    // Delete Last Element.
    public void deleteTrailNode() {
        if (isEmpty()) {
            System.out.println("As LinkedList is Empty hence not able to perform delete operation");
            return;
        }
        if (size == 1) {
            headNode = null;
            trailNode = null;
            size--;
            return;
        }
        Node preNode = headNode;
        while (preNode.next != trailNode) {
            preNode = preNode.next;
        }
        preNode.next = null;
        trailNode = preNode;
        size--;
    }

    // Delete node from the position.
    public void deleteAtPosition(int position) {
        if (position < 1 || position > size) {
            System.out.println("deleteAtPosition will not delete any element bcz position is incorrect");
            return;
        }
        if (position == 1) {
            deleteHeadNode();
            return;
        }
        if (position == size) {
            deleteTrailNode();
            return;
        }
        Node preNode = headNode;
        for (int i = 1; i < position - 1; i++) {
            preNode = preNode.next;
        }
        Node currentNode = preNode.next;
        preNode.next = currentNode.next;
        currentNode.next = null;
        size--;
    }

    // Delete node from the given Value.
    public boolean deleteValue(int data) {
        if (isEmpty()) {
            System.out.println("Linked:List is empty can not perform delete operation");
            return false;
        }
        if (headNode.data == data) {
            deleteHeadNode();
            return true;
        }
        if (trailNode.data == data) {
            deleteTrailNode();
            return true;
        }
        Node prevNode = headNode;

        while (prevNode.next != trailNode) {
            if (prevNode.next.data == data) {
                Node currentNode = prevNode.next;
                prevNode.next = currentNode.next;
                currentNode.next = null;
                size--;
                return true;
            } else {
                prevNode = prevNode.next;
            }
        }
        return false;
    }

    // ================================
    // Updation
    // ================================

    // Update Value at given position.
    public void updateAtPosition(int position, int data) {
        if (isEmpty()) {
            System.out.println("List is empty can't perform operation");
            return;
        }
        if (position < 1 || position > size) {
            System.out.println("Can't Perform Update Operation because position is invalid");
            return;
        }

        Node currNode = headNode;
        for (int i = 1; i < position; i++) {
            currNode = currNode.next;
        }
        currNode.data = data;
    }

    // Update Old value with new given value.
    public boolean updateValue(int oldValue, int newValue) {
        if (isEmpty()) {
            System.out.println("List is empty can't perform operation");
            return false;
        }
        Node currNode = headNode;
        while (currNode != null) {
            if (currNode.data == oldValue) {
                currNode.data = newValue;
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }
}