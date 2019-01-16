package p10_in_out;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile2 {
    public static void main(String[] args) {

        int i;
        FileInputStream fin = null;
        String path = "src/resources/test.txt";

        if (path.isEmpty()) {
            System.out.println("Cannot find given file name");
            return;
        }

        try {
            fin = new FileInputStream(path);
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException exc) {
            System.out.println("File not found");
        } catch (IOException exc) {
            System.out.println("Error occurred while reading the file");
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Error occurred while closing the file");
            }
        }
    }
}
