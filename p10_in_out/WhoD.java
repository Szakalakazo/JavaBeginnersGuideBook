package p10_in_out;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhoD {
    public static void main(String[] args) {
        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the text or type 'stop' to exit.");

        try (FileWriter fw = new FileWriter("filewriter.txt")) {
            do {
                System.out.print(": ");
                str = br.readLine();
                if (str.compareTo("stop") == 0) break;

                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("In Out error occurred.");
        }
    }
}
