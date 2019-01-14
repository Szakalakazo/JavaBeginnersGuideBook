package p08_interface.interfaces;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Next value: " + ob.getNext());
        }

        System.out.println("\nRestart");
        ob.reset();

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Next value: " + ob.getNext());
        }

        System.out.println("\nStart from 100");
        ob.setStart(100);

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Next value: " + ob.getNext());
        }
    }
}
