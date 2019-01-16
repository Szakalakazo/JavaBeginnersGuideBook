package p10_in_out;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i = 0;
        FileInputStream fin;
        String path = "src/resources/test.txt";

        if (path.isEmpty()) {
            System.out.println("Sposob uzycia ");
            return;
        }

        try {
            fin = new FileInputStream(path);
        } catch (FileNotFoundException exc) {
            System.out.println("File not found");
            return;
        }

        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Error occurred while reading the file");
        } finally {
            try {
                fin.close();
            } catch (IOException exc) {
                System.out.println("Error occurred while closing the file");
            }
        }
    }
}
