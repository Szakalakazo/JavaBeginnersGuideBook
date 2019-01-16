package p10_in_out;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i = 0;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        String[] path = {"src/resources/test.txt", "src/resources/copy.txt"};

        for (i = 0; i < path.length; i++) {
            if (path[i].isEmpty()) {
                System.out.println("File not found!");
                return;
            }
        }

        try {
            fin = new FileInputStream(path[0]);
            fout = new FileOutputStream(path[1]);

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("In-Out error occurred: " + exc);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Error occurred while closing origin file");
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException exc) {
                System.out.println("Error occurred while closing copied file");
            }
        }
    }
}