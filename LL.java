public class LL {

    private Node head;
    private Node tail;
    int size;

    LL() {
        this.size = 0;
    }

    public class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void InsertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void InsertLast(int value) {

        if (tail == null) {
            InsertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public void Insert(int value, int index) {
        if (index == 0) {
            InsertFirst(value);
            return;
        }
        if (index == size) {
            InsertLast(value);
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public int DeleteFirst() {
        Node node = head;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return node.value;
    }


    public int DeleteLast() {

        if (size <= 1) {
            return DeleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        secondLast.next = null;

        return value;
    }


    public int Delete(int index) {
        if (index == 0) {
            return DeleteFirst();
        }
        if (index == size - 1) {
            return DeleteLast();
        }

        Node prev = get(index - 1);
        int value = prev.next.value;
        prev.next = prev.next.next;

        return value;

    }

    public void combine(Node head1,Node head2){
        Node temp = head1;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = head2;
    }

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        LL linkedlist = new LL();
        linkedlist.InsertFirst(100);
        linkedlist.InsertFirst(101);
        linkedlist.InsertFirst(102);
        linkedlist.Insert(1001, 2);
        linkedlist.Delete(2);
        linkedlist.Display();

    }
}