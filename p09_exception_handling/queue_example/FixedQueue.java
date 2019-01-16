package p09_exception_handling.queue_example;

import p08_interface.queue.ICharQ;

public class FixedQueue implements ICharQExc {
    private char[] q;
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    @Override
    public void put(char c) throws QueueFullException {
        if (putloc == q.length) throw new QueueFullException(q.length);
        q[putloc] = c;
        putloc++;
    }

    @Override
    public char get() throws QueueEmptyException {
        if(getloc == putloc) throw new QueueEmptyException();
        return q[getloc++];
    }

    @Override
    public void reset() {
    }
}
