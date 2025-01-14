package concepts.handson.fileoperations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample{

    public static void main(String[] args) {

        //initialising file writer object to store data
        try(FileWriter file = new FileWriter("test.file")){
            file.write("I have used try with resources to auto close the resource file and optimising the space handling of my program.");
            System.out.println("---------------------- FIle is created!!! ----------------------");

            System.out.println(file.getClass());
        } catch (IOException e) {
            //catching IO exception
            throw new RuntimeException(e);
        }

    }
}
