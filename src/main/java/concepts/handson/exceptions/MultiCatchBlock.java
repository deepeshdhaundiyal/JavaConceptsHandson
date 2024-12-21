package concepts.handson.exceptions;

public class MultiCatchBlock
{
    public static void main(String[] args) {

        try{
            int n = 10/0;
            String name = null;
            name.length();
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception caught : " + e);
        }
        catch (NullPointerException e)
        {
            System.out.println("Null pointer exception caught : " + e);
        }
    }
}
