/**
 * Created by Brownie on 4/16/2017.
 */
public class DoublyLinked {
    private static Node head;
    private static Node tail;
    private static int size;

    public DoublyLinked() {
        head = null;
        tail = null;
        size = 0;
    }

    public void forwardTrav() {
        Node temp = head;
        System.out.print("Iterate Forward:\n");
        if (temp == null) {
            System.out.print("List is empty");
        }
        while (temp != null) {
            System.out.print(temp.getData() + ", ");
            temp = temp.getNext();
        }
    }

    public void add(String data) {
        Node newNode = new Node(data, null, null);
        Node temp, holder;
        //if the list is empty put item into the list
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }

        size++;
    }

    public void backTrav() {
        Node temp = tail;
        System.out.print("Iterate backward:\n");
        if (temp == null) {
            System.out.print("List is empty");
        }
        while (temp != null) {
            System.out.print(temp.getData() + ", ");
            temp = temp.getPrev();
        }
    }

    public static void bubbleSort() {
        boolean sorted = false;
        Node current = head;
        Node next = current.getNext();
        while (sorted == false) {
            if (head.getData().compareTo(head.getNext().getData()) >= 0) {
                head.getNext() =
            }
            for (int i = 1; i < size; i++) {
                if (current.getData().compareTo(next.getData()) >= 0) {
                    current.getPrev() = next;

                }

            }

        }
    }
}


