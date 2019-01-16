package p10_in_out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChars {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter a character, '.' sign ends the program");

        do {
            c = (char) bf.read();
            System.out.println(c);
        } while (c != '.');
    }
}
