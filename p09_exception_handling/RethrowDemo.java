package p09_exception_handling;

public class RethrowDemo {
    public static void main(String[] args) {
        try{
            Rethrow.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("-- Critical Error -- " + " end of program");
        }
    }
}
