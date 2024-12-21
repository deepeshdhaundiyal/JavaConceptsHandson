package concepts.handson.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources
{
    public static void main(String[] args) {

        //using try-with-resources to make sure that BufferedReader is automatically closed when the try block finishes
        try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))){
            String line = br.readLine();
            System.out.println(line);
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Exception caught " + e);
            throw new RuntimeException(e);
        }

    }
}
