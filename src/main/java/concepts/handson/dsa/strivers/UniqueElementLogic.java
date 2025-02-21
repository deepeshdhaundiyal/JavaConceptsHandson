package concepts.handson.dsa.strivers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueElementLogic
{

    public static void main(String[] args) {

                //given list
                List<Integer> list = Arrays.asList(1, 2, 3, 1, 2, 4);

                //declare a uniqueElements list object to store unique Elements from list.
                List<Integer> uniqueElements = new ArrayList<>();

                //Traverse loop to store unique elements
                for(int values : list){

                    //logic to add unique elements
                    if(!uniqueElements.contains(values)){
                        uniqueElements.add(values);
                    }
                }

                //print out the unique elements
                System.out.println(uniqueElements);

    }
}
