package p09_exception_handling;

class UseFinally {
    public static void genException(int what) {
        int t;
        int[] nums = new int[2];

        System.out.println(what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what;
                    break;
                case 1:
                    nums[4] = 1;
                    break;
                case 2:
                    return;
            }
        } catch (ArithmeticException exc) {
            System.out.println("Can't divide by 0");
            return;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("The corresponding element of the table is missing");
        } finally {
            System.out.println("Exiting try block");
        }
    }
}

public class FinallyDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}
