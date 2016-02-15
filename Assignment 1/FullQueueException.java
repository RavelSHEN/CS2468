/**
 * Runtime exception thrown when one tries to perform operation enqueue
 * on an full queue.
 */

public class FullQueueException extends RuntimeException {
  public FullQueueException(String err) {
    super(err);
  }
}
