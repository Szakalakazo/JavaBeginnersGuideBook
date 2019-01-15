package p09_exception_handling;

public class ExcDemo5 {
    public static void main(String[] args) {
        int[] num1 = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] num2 = {2, 0, 4, 4, 8, 0};

        for (int i = 0; i < num1.length; i++) {
            try {
                System.out.println(num1[i] + " / " + num2[i] + " is equal to " + num1[i] / num2[i]);
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("The corresponding element of the table is missing");
            } catch (Throwable exc) {
                System.out.println("Exception occured");
            }
        }
    }
}
