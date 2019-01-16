package p09_exception_handling;

import java.io.IOException;

public class ThrowsDemo {
    public static char prompt(String str) throws IOException {
        System.out.println(str + " ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;

        try {
            ch = prompt("Enter a letter using keyboard:");
        }catch (IOException exc) {
            System.out.println("In-Out exception occured");
            ch = 'X';
        }
        System.out.println("You entered " + ch + " button.");
    }
}
