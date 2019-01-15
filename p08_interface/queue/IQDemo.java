package p08_interface.queue;

class FixedQueue implements ICharQ {
    private char[] q;
    private int putloc, getloc;
    private int size;

    public FixedQueue(int size) {
        this.size = size;
        q = new char[size];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println("  -- Queue full.");
            return;
        }
        q[putloc] = ch;
        putloc++;
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println("  -- Queue empty.");
            return (char) 0;
        }
        return q[getloc++];
    }

    @Override
    public void reset() {
        q = new char[size];
        putloc = getloc = 0;
    }

}

class CircularQueue implements ICharQ {
    private char[] q;
    private int putloc, getloc;
    private int size;

    CircularQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
        this.size = size;
    }

    @Override
    public void put(char ch) {
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println("-- Queue full.");
            return;
        }

        q[putloc++] = ch;
        if (putloc == q.length) putloc = 0;
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println("-- Queue empty.");
            return (char) 0;
        }
        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0;
        return ch;
    }

    @Override
    public void reset() {
        q = new char[size];
        putloc = getloc = 0;
    }
}

class DynQueue implements ICharQ {
    private char[] q;
    private int putloc, getloc;
    private int size;

    public DynQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
        this.size = size;
    }

    @Override
    public void put(char c) {
        if (putloc == q.length) {
            char[] t = new char[q.length * 2];

            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }
            q = t;
        }
        q[putloc++] = c;
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println("-- Queue empty.");
            return (char) 0;
        }
        return q[getloc++];
    }

    @Override
    public void reset() {
        q = new char[size];
        putloc = getloc = 0;
    }
}


public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(4);
        DynQueue q2 = new DynQueue(4);
        CircularQueue q3 = new CircularQueue(4);

        ICharQ iQ;
        char ch;
        int i;

        //==============================================================
        System.out.println("\n***Fixed loop queue:***");

        iQ = q1;

        for (i = 0; i < 6; i++) {
            iQ.put((char) ('A' + i));
        }

        System.out.println("***Displaying the queue:*** ");

        for (i = 0; i < 5; i++) {
            ch = iQ.get();
            System.out.println(ch);
        }
        System.out.println();

        //==============================================================
        System.out.println("\n***Dynamic loop queue:*** ");

        iQ = q2;

        for (i = 0; i < 6; i++) {
            iQ.put((char) ('Z' - i));
        }

        System.out.println("***Displaying the queue:*** ");
        for (i = 0; i < 6; i++) {
            ch = iQ.get();
            System.out.println(ch);
        }
        System.out.println();

        //==============================================================
        System.out.println("\n***Recurring loop queue:*** ");

        iQ = q3;

        for (i = 0; i < 6; i++) {
            iQ.put((char) ('A' + i));
        }

        /*
        System.out.println("Displaying the queue: ");
        for (i = 0; i < 6; i++) {
            ch = iQ.get();
            System.out.println(ch);
        }
        System.out.println();
        */
        System.out.println("Resetting the queue: ");
        iQ.reset();
        for (i = 0; i < 6; i++) {
            ch = iQ.get();
            System.out.println(ch);
        }
    }
}
