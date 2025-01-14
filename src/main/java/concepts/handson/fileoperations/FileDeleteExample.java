package concepts.handson.fileoperations;

import java.io.File;
import java.io.IOException;

public class FileDeleteExample {

    public static void main(String[] args) {

        File file = new File("test.file");
        file.delete();
        System.out.println("File Deleted");

    }
}
