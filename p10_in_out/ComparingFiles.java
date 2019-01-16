package p10_in_out;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ComparingFiles {
    public static void main(String[] args) {
        int i = 0, j = 0;

        String[] path = {"src/resources/test.txt", "src/resources/copy.txt"};

        for (i = 0; i < path.length; i++) {
            if (path[i].isEmpty()) {
                System.out.println("File not found!");
                return;
            }
        }

        try (FileInputStream f1 = new FileInputStream(path[0]);
             FileInputStream f2 = new FileInputStream(path[1])) {
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) break;
            } while (i != -1 && j != -1);

            if (i != j) System.out.println("Files are different");
            else System.out.println("Files are the same");
        } catch (IOException exc) {
            System.out.println("In-Out error occurred: " + exc);
        }
    }
}
