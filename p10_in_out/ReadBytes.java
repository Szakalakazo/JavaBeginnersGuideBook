package p10_in_out;

import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];

        System.out.println("Enter some text:");
        System.in.read(data);
        System.out.println("You entered: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
        }
    }
}
