/**
 * Created by Brownie on 4/16/2017.
 */
public class Node {
    private int data;
    private Node next, prev;
    /*Constructor method */
    public Node(){
        data = 0;
        next = null;
        prev = null;

    }
    /*  Constructor with parameters*/
    public Node(int data,Node next, Node prev) {

        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    /* Get next node method*/
    public Node getNext() {
        return next;
    }

    /* Set next node method*/
    public void setNext(Node next)
    {
        this.next = next;
    }

    /* Method to return previous node */
    public Node getPrev(){
        return prev;
    }

    /*Method to set previous node */
    public void setPrev(Node prev){
        this.prev = prev;
    }

    /*method to return the node in String */
    public int getData() {
        return data;
    }

    /*Method to set the data of node */
    public void setData(int data) {
        this.data = data;
    }


    /*To string method to return the data of node */
    public String toString() {
        return " Name : "+this.data;
    }

}


