package concepts.handson.fileoperations;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample
{
    public static void main(String[] args) {

        try
        {
            File file = new File("test.file");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException io)
        {
            throw new RuntimeException(io);
        }
    }
}
