/**
 * Runtime exception thrown when one tries to perform operation top or
 * pop on an empty stack.
 * @author Roberto Tamassia
 */

public class EmptyQueueException extends RuntimeException {
  public EmptyQueueException(String err) {
    super(err);
  }
}
