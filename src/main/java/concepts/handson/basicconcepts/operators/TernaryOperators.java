package concepts.handson.basicconcepts.operators;

public class TernaryOperators
{

    public static void main(String[] args) {

        //initialising age attribute
        int age = 54;
        boolean voter = false;


        //a short program if user age is 18 or greater set voter = true else false
        voter = (age >= 18) ? true : false ;

        System.out.println(voter);

    }
}
