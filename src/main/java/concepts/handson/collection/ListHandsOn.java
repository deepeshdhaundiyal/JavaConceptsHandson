package concepts.handson.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListHandsOn{

    public static void main(String[] args) {

        //Adding String objects into the list
        List<String> list = new ArrayList();
        list.add("Deepesh");
        list.add("Rahul");
        list.add("Rohit");
        list.add("Srv");
        list.add("Gaurav S");
        list.add("Ram");

        //printing the original list
        System.out.println(list);

        //Using comparator interface for implementing sorting based on String's length
        Comparator<String> studentList = (o1, o2) -> (o1.length() > o2.length()) ? 1 : -1;

        //ternary operator (o1.length() > o2.length()) ? 1 : -1;
        /*here we have used ternary operator that helps to write down code into a single line
                the above expression is indicating below line of code...
        if(o1.length() > o2.length())
        {
            return 1;
        }
        else
        {
            return -1;
        } */

        Collections.sort(list,studentList);

        //Using for each iteration for printing names in new line
        for(String stud : list)
        System.out.println(stud);

    }

}
