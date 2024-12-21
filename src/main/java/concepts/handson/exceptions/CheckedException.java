package concepts.handson.exceptions;


import java.io.BufferedReader;
import java.io.FileReader;

//checked at compile-time. If a method is capable of throwing a checked exception,
//it must either handle it using a try-catch block or declare it using the 'throws' keyword.
public class CheckedException {

    public static void main(String[] args) {

        try {
            //declaring a file reader object that contains a non-existing file
            FileReader file = new FileReader("nonexistfile.txt");
            //passing the file into BufferReader for further operations
            BufferedReader fileInput = new BufferedReader(file); //when the constructor try to read the file, it might throw error as file doesn't exist.
            fileInput.readLine();
            fileInput.close();
        }
        //demonstrating how to catch an IO exception 
        catch (Exception e)
        {
            System.out.println("Exception occured at --class name -- " + e);
        }
    }

}
