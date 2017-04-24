/**
 * Created by Brownie on 4/16/2017.
 */
public class main {

    public static void main(String[] args) {


        DoublyLinked list = new DoublyLinked();

//add items to list
        list.add(53);
        list.add(953);
        list.add(876);
        list.add(4345);
        list.add(21);
        list.add(123);
        list.add(742);
        list.add(33);
        list.add(646);

//print the list unsorted
        list.traverse();
        System.out.println("");
        System.out.println("Sort the list");

        //sort the list
        list.bubbleSort();

        //print list after the sort
        list.traverse();
        System.out.println("");
        System.out.println("done");




}
}

