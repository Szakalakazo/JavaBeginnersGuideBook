package p08_interface.interfaces;

public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos obTwo = new ByTwos();
        ByThrees obThree = new ByThrees();
        Series ob;

        for (int i = 0; i < 5; i++) {
            ob = obTwo;
            System.out.println("Next value in sequence byTwos: " + ob.getNext());

            ob = obThree;
            System.out.println("Next value in sequence obThree: " + ob.getNext());
        }
    }
}
