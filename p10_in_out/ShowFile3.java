package p10_in_out;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile3 {
    public static void main(String[] args) {

        int i = 0;
        String path = "src/resources/copy.txt";

        if (path.isEmpty()) {
            System.out.println("No file selected.");
            return;
        }

        try {
            FileInputStream fin = new FileInputStream(path);

            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("In-Out error occurred: " + exc);
        }
    }
}
