public class exp5 {
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            prev = next = null;
        }
    }
    Node head = null;
    void insertAtBeginning(int data) { // Insert at beginning
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }
    void insertAtEnd(int data) { // Insert at end
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    } 

    void insertAtPosition(int data, int pos) {// Insert at specific position
        Node newNode = new Node(data);

        if (pos == 1) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp != null) {
            newNode.next = temp.next;
            newNode.prev = temp;

            if (temp.next != null)
                temp.next.prev = newNode;

            temp.next = newNode;
        }
    }

    void deleteAtBeginning() { // Delete at beginning
        if (head == null) return;

        head = head.next;
        if (head != null)
            head.prev = null;
    }

    void deleteAtEnd() { // Delete at end
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.prev.next = null;
    }

    void deleteAtPosition(int pos) {  // Delete at specific position
        if (head == null) return;

        if (pos == 1) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos && temp != null; i++)
            temp = temp.next;

        if (temp != null) {
            if (temp.next != null)
                temp.next.prev = temp.prev;

            if (temp.prev != null)
                temp.prev.next = temp.next;
        }
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        exp5 list = new exp5();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.insertAtPosition(15, 3);
        list.display();
        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.deleteAtPosition(1);
        list.display();
    }
}
