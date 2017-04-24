/**
 * Created by Brownie on 4/16/2017.
 */
public class BubbleSort {
    private static Node head;
    private static Node tail;
    private int size;

    public BubbleSort() {
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
            System.out.println(temp.getData());
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
            temp = head;
            holder = head.getNext();
            //if the data is lower alphabetically do this
            while (holder != null) {
                //if data has reached end of the list then put data here
                if (holder.getNext() == null) {
                    holder.setNext(newNode);
                    newNode.setPrev(holder);
                    tail = newNode;
                    break;
                }
                //iterates through the list
                else {
                    temp = holder;
                    holder = holder.getNext();
                }
            }
        }
        size++;
    }
}
