package p09_exception_handling.queue_example;

public class QueueEmptyException extends Exception {
    public String toString() {
        return "\nQueue is empty.";
    }
}
