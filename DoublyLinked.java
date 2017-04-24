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

//print out the list in order
    public void traverse() {
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

//add items to a list
    public void add(int data) {
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

//Sort a linked list by bubble sort
    public static void bubbleSort() {
        for (int i = 0; i < size; i++) {
            Node current = head;
            Node next = current.getNext();
            for (int j = 0; j < size; j++) {
                if (next == null) {
                    break;}
                    if (current.getData()>(next.getData())) {
                        swap(current, next);
                    }
                    current = next;
                    next = current.getNext();
                }
            }
    }
    
    //Swap nodes Data
    public static void swap(Node one, Node two) {
        int temp = one.getData();
        one.setData(two.getData());
        two.setData(temp);
        }
    }






