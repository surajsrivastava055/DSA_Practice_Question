package LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList ob = new SinglyLinkedList();
        // Insertion
        ob.insertAtHead(30);
        ob.insertAtHead(20);
        ob.insertAtHead(10);
        ob.printList();

        ob.insertAtTrail(40);
        ob.insertAtTrail(50);
        ob.printList();

        ob.insertAtSpecificPosition(3, 25);
        ob.insertAtSpecificPosition(5, 35);
        ob.printList();

        // Searching
        System.out.println("Data Found:" + ob.searchData(90));
        System.out.println("Data Found at:" + ob.findDataAtWhichPosition(05));

        // Delete
        ob.deleteHeadNode();
        ob.printList();

        ob.deleteTrailNode();
        ob.printList();

        ob.deleteAtPosition(3);
        ob.printList();

        ob.deleteValue(25);
        ob.printList();

        // update operation
        ob.updateAtPosition(3, 88);
        ob.printList();

        ob.updateValue(35, 50);
        ob.printList();

    }
}
