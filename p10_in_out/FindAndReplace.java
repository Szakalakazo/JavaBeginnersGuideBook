package p10_in_out;

import java.io.*;

public class FindAndReplace {
    public static void main(String[] args) throws IOException {
        int i;

        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream("test.txt");
            fout = new FileOutputStream("copy.txt");

            do {
                i = fin.read();
                if ((char) i == ' ') i = '_';
                if (i != -1) fout.write(i);

            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("In Out error occurred.");
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Error occurred while closing copied file");
            }
        }
    }
}
