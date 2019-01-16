package p10_in_out;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args) {
        double[] data = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;

        try (RandomAccessFile raf = new RandomAccessFile("test.txt", "rw")) {
            for (int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }

            raf.seek(0);
            d = raf.readDouble();
            System.out.println("First value: " + d);

            raf.seek(8);
            d = raf.readDouble();
            System.out.println("Second value: " + d);

            raf.seek(8 * 3);
            d = raf.readDouble();
            System.out.println("Fourth value: " + d);

            System.out.println();

            System.out.println("Every second value:");
            for (int i = 0; i < data.length; i++) {
                raf.seek(i * 8);
                d = raf.readDouble();
                System.out.println(d + " ");
            }
        } catch (IOException exc) {
            System.out.println("in-Out error occurred.");
        }

    }
}
