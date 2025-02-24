package concepts.handson.dsa.strivers;

import java.util.HashSet;

//find the elements such that it sums the target value 'k' from arrays A and B such that arrOfA[1] + arrOfB[0] = 9 (The target value)
public class TargetElement
{

    public static void main(String[] args) {

        //given are two arrays
        int arrOfA[] = {2,3,-2,5,0,3,3};
        int arrOfB[] = {6,1,11,4,9,9,6};

        //with same length n
        int n = arrOfA.length;

        //the target value is given as
        int targetValueK = 9;

        //Hashset to store the elements
        HashSet<Integer> hashSetElements = new HashSet<>();

        //storing elements into hast set
        for(int elements : arrOfB){
            hashSetElements.add(elements);
        }

        //logic to check pairs that provides target value
        for(int i=0; i<n; i++){

            int compliment = targetValueK - arrOfA[i];

            if(hashSetElements.contains(compliment)){
                System.out.println("The given pairs are " + compliment + " and " + arrOfA[i]);
            }
        }
    }
}
