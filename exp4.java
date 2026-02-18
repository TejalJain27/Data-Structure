public class exp4 {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    Node head = null;

    void insertAtBeginning(int data) { // Insert at beginning
        Node newNode = new Node(data);
        newNode.next = head;
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
    }

    void insertAtPosition(int data, int pos) { // Insert at specific position
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void deleteAtBeginning() { // Delete at beginning
        if (head != null)
            head = head.next;
    }

    void deleteAtEnd() { // Delete at end
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    void deleteAtPosition(int pos) {  // Delete at specific position
        if (head == null) return;

        if (pos == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
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
        exp4 list = new exp4();

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
