package p10_in_out;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles2 {
    public static void main(String[] args) {
        int i = 0;

        String[] path = {"src/resources/test.txt", "src/resources/copy.txt"};

        for (i = 0; i < path.length; i++) {
            if (path[i].isEmpty()) {
                System.out.println("File not found!");
                return;
            }
        }

        try {
            FileInputStream fin = new FileInputStream(path[0]);
            FileOutputStream fout = new FileOutputStream(path[1]);

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("In-Out error occurred: " + exc);
        }
    }
}
