public interface Queue{

  public int size();

  public boolean isEmpty();

  public Object front() throws EmptyQueueException;

  public void enqueue(Object obj) throws FullQueueException;

  public Object dequeue() throws EmptyQueueException;
}
