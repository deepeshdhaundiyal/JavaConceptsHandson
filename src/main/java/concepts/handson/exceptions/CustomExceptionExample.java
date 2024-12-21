package concepts.handson.exceptions;

public class CustomExceptionExample
{

    public static void main(String[] args) {

        try{
            checkAgeMethod(16);
        }catch (ArithmeticException | InvalidAgeException e){
            System.out.println("Exception occurred " + e);
        }
    }

    private static void checkAgeMethod(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Please enter a valid age");
        }
    }
}

//creating a class to define customise exception
class InvalidAgeException extends Exception{

    //initialising constructor
    public InvalidAgeException(String please_enter_a_valid_age) {
        super(please_enter_a_valid_age);
    }
}