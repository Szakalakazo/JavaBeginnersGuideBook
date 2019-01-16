package p09_exception_handling.queue_example;

public class QueueFullException extends Exception {
    int size;

    QueueFullException(int size) {
        this.size = size;
    }

    public String toString() {
        return "\nQueue full. Max size is: " + size;
    }
}
