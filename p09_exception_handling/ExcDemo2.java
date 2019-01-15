package p09_exception_handling;

class ExcTest {
    static void genExceptoin() {
        int[] nums = new int[4];

        System.out.println("Before generating an exception");

        nums[7] = 10;
    }
}


public class ExcDemo2 {
    public static void main(String[] args) {

        try {
            ExcTest.genExceptoin();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out of range!");
        }
        System.out.println("After catch.");
    }
}
