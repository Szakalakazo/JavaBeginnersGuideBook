package p08_interface.interfaces;

public interface Series2 {
    int getNext();

    default int[] getNextArray(int n) {
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) getNext();
        return vals;
    }

    void reset();

    void setStart(int x);
}
