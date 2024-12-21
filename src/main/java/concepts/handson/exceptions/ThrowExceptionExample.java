package concepts.handson.exceptions;

public class ThrowExceptionExample
{
    public static void main(String[] args) {
        try {
            checkAge(16);
        }catch (ArithmeticException e)
        {
            System.out.println("Exception caught ---class name--- " + e);
        }
    }

    private static void checkAge(int age){
        if(age< 18){
            //this will add the message to the Exception e
            throw new ArithmeticException("Age must be 18 or older.");
        }else{
            System.out.println("Access Granted!");
        }
    }
}
