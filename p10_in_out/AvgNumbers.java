package p10_in_out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AvgNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0;
        double avg, t;

        System.out.println("How many number will you enter? ");
        str = br.readLine();
        try {
            n = Integer.parseInt(str);
        } catch (NumberFormatException exc) {
            System.out.println("Incorrect format!");
            n = 0;
        }

        System.out.println("Please enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(": ");
            str = br.readLine();
            try {
                t = Double.parseDouble(str);
            } catch (NumberFormatException exc) {
                System.out.println("Incorrect format!");
                t = 0;
            }
            sum += t;
        }
        avg = sum / n;
        System.out.println("Average is: " + avg);
    }
}
