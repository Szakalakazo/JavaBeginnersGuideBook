package p09_exception_handling.queue_example;

public interface ICharQExc {

    void put(char c) throws QueueFullException;

    char get() throws QueueEmptyException;

    void reset();

}
