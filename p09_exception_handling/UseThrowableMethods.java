package p09_exception_handling;

class EscTest {
    static void genException() {
        int[] nums = new int[4];

        System.out.println("Before generating an exception");
        nums[5] = 10;
    }
}

public class UseThrowableMethods {
    public static void main(String[] args) {

        try {
            ExcTest.genExceptoin();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Standard error monit:");
            System.out.println(exc);
            System.out.println("\nStackTrace:");
            exc.printStackTrace();
        }
        System.out.println("After try/catch");
    }
}
