package LinkedList;
public class LinkedList {
    Node head;
    int count;
    public LinkedList() {
        head = null;
        count = 0;
    }
    public LinkedList(Node newHead) {
        head = newHead;
        count = 1;
    }
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
    }
    public static void main(String[] args) {

    }
}
