package concepts.handson.exceptions;

//the 'finally' block will execute even
//if an exception is caught in the try block.
public class TryCatchFinallyBlock
{
    public static void main(String[] args) {

        try {
            int arr[] = new int [6];
            System.out.println(arr[7]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Caught exception " + e);
        }
        finally {
            System.out.println("This block will execute no matter whats the situation!");
        }
    }
}
