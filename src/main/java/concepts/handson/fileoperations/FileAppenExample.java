package concepts.handson.fileoperations;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppenExample {

    public static void main(String[] args) {

        //by passing true we will be able to add new data to previous file
        try(FileWriter file = new FileWriter("test.file",true)){
             file.write("Adding new details to my file. /n");
            System.out.println("-------------------- File appended --------------------");
        }catch (IOException io){
                throw new RuntimeException(io);
        }

        //BufferedWriter makes it easier to write text to a file and automatically handles buffering for efficient writing.
        //It also provides a convenient method called newLine()
    }
}
