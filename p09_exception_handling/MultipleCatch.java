package p09_exception_handling;

public class MultipleCatch {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char[] chars = {'A', 'B', 'C'};

        for (int i = 0; i < 2; i++) {
            try {
                if (i == 0) result = a / b;
                else chars[5] = 'A';
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {
                System.out.println("An exception " + exc + " caught");
            }
        }
        System.out.println("After try / catch");
    }
}
