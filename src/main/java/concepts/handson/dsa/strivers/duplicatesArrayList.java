package concepts.handson.dsa.strivers;

import java.util.*;

public class duplicatesArrayList
{

    public static void main(String[] args) {

        //lets say we have a list

        List<Integer> list = Arrays.asList(1, 2, 3, 1, 2, 4);



//declare a hashset (Set) object to store unique elements

        HashSet<Integer> uniqueElement = new HashSet();



//traverse list to store values into set or skip iteration by
            uniqueElement.addAll(list);




//print unique elements as we know our hash will contains only non repeated elements

        System.out.println(uniqueElement);

    }
}
