package p10_in_out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DtoS {
    public static void main(String[] args) {
        String s;

        try (BufferedReader br = new BufferedReader(new FileReader("filewriter.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("In Out error occurred.");
        }
    }
}
