package concepts.handson.exceptions;

//This types of example are also known as Runtime exceptions as often occurs at run time of program
//for Example: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException
public class UnCheckedException
{
    public static void main(String[] args) {

        //initialising attributes
        int [] arr = new int [5];

        try {
            System.out.println(arr[7]);  //this will throw out of Index error
        }
        catch (ArrayIndexOutOfBoundsException e) //catch block to handle out of index error
        {
            System.out.println("Exception occurs at ---class name--- " + e);
            //we can use logger classes for further
        }

    }
}
