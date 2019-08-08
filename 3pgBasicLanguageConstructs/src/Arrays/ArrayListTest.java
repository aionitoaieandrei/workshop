package Arrays;
import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        //Creating a generic ArrayList
        ArrayList<String> arlTest = new ArrayList<String>();

        //Size of arrayList
        System.out.println("Size of ArrayListTest at creation: " + arlTest.size());

        //Lets add some elements to it
        arlTest.add("B");
        arlTest.add("E");
        arlTest.add("Q");
        arlTest.add("A");

        //Recheck the size after adding elements
        System.out.println("Size of ArrayListTest after adding elements: " + arlTest.size());

        //Display all contents of ArrayListTest
        System.out.println("List of all elements: " + arlTest);

        //Remove some elements from the list
        arlTest.remove("B");
        System.out.println("See contents after removing one element: " + arlTest);

        //Remove element by index
        arlTest.remove(0);
        System.out.println("See contents after removing element by index: " + arlTest);

        //Check size after removing elements
        System.out.println("Size of arrayList after removing elements: " + arlTest.size());
        System.out.println("List of all elements after removing elements: " + arlTest);

        //Check if the list contains "K"
        System.out.println(arlTest.contains("K"));
    }
}
