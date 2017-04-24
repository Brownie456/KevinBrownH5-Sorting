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
        Node current = head;
        Node next = current.getNext();

        for (int i = 0; i < size; i++) {
            //System.out.println(i+"i");
            for (int j = 0; j < size; j++) {
                if (next == null) {
                    break;}
                    if (current.getData().compareTo(next.getData()) >= 0) {
                        swap(current, next);
                    }
                    current = next;
                    next = current.getNext();
                    //System.out.println(j+"j");
                }
            }
        }



    public static void swap(Node one, Node two) {
        if (one == two.getPrev() || two == one.getPrev()) {
         /* Order is relevant */
            Node first;
            Node second;
            //if (one == two.getPrev()) {
            first = one;
            second = two;
            //} else {
            //    first = two;
            //     second = one;
            // }

            first.setNext(second.getNext());
            second.setPrev(first.getPrev());

            if (first.getNext() != null)
                first.getNext().setPrev(first);

            if (second.getPrev() != null)
                second.getPrev().setNext(second);

            second.setNext(first);
            first.setPrev(second);


        }
    }
    }





