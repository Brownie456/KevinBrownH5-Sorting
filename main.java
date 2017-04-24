/**
 * Created by Brownie on 4/16/2017.
 */
public class main {

    public static void main(String[] args) {


        DoublyLinked list = new DoublyLinked();


        list.add("5");
        list.add("9");
        list.add("8");
        list.add("4");
        list.add("2");
        list.add("1");
        list.add("7");
        list.add("3");
        list.add("6");

        //System.out.println(list.tail);
       // System.out.println("");
       // System.out.println(list.head);

        list.forwardTrav();
        System.out.println("");
        System.out.println("Sort the list");

        list.bubbleSort();
        list.forwardTrav();
        System.out.println("");
        System.out.println("done");




}
}

