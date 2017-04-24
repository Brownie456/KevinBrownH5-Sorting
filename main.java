/**
 * Created by Brownie on 4/16/2017.
 */
public class main {

    public static void main(String[] args) {


        DoublyLinked list = new DoublyLinked();


        list.add("5");
        list.add("42");
        list.add("88");
        list.add("4");
        list.add("2");
        list.add("1");
        list.add("500");
        list.add("24");
        list.add("86");
        list.add("13");

        list.forwardTrav();
        System.out.println("");
        System.out.println("Sort the list");

        list.bubbleSort();
        list.forwardTrav();
        System.out.println("");



}
}

