package p09_exception_handling;

class NonIntResultException extends Exception {
    int n;
    int d;

    NonIntResultException(int n, int d) {
        this.n = n;
        this.d = d;
    }

    public String toString() {
        return "The result of " + n + " / " + d + " is not an integer.";
    }
}


public class CustomExceptDemo {
    public static void main(String[] args) {

        int[] num1 = {4, 8, 15, 32, 64, 127, 256, 512};
        int[] num2 = {2, 0, 4, 4, 8, 0};
        for (int i = 0; i < num1.length; i++) {
            try {
                if (num1[i] % 2 != 0) throw new NonIntResultException(num1[i], num2[i]);
                System.out.println(num1[i] + " / " + num2[i] + " = " + num1[i] / num2[i]);
            } catch (ArithmeticException exc) {
                System.out.println("Can't divide by 0!!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("The corresponding element of the table is missing");
            } catch (NonIntResultException exc) {
                System.out.println(exc);
            }
        }
    }
}
