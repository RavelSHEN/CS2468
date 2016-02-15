/**
 * Implementation of the Queue interface using a fixed-length array.
 * An exception is thrown if a enqueue operation is attempted when the
 * size of the queue is equal to the length of the array - 1.
 * An exception is thrown if a dequeue operation or front operation is
 * attemped when the queue is empty.
 */
public class ArrayQueue{
  /**
   * Default length of the array used to implement the queue.
   */
  public static final int CAPACITY = 1000;
  /**
   * Length of the array used to implement the queue.
   */
  protected int capacity;
  /**
   * Array used to implement the queue.
   */
  protected Object Q[];
  /**
   * Index of the first element and the elements immediately past
   * the rear element of the queue in the array.
   */
  protected int head = 0, tail = 0;
  /**
   * Initialize the queue to use an array of default length CAPACITY.
   */
  public ArrayQueue(){
    this(CAPACITY);
  }
  /**
   * Initialize the queue to use an array of given length.
   *
   * @param cap length of the array.
   */
  public ArrayQueue(int cap){
    capacity = cap;
    Q = new Object[capacity];
  }
  /**
   * O(1) time.
   */
  public int size(){
    return (this.capacity - head + tail) % this.capacity;
  }
  /**
   * O(1) time.
   */
  public boolean isEmpty(){
    return (head == tail);
  }
  /**
   * O(1) time.
   * @exception EmptyStackException if the queue is empty.
   */
  public Object front() throws EmptyQueueException{
    if (this.isEmpty()){
      throw new EmptyQueueException("Queue is empty");
    }
    else{
      return Q[head];
    }
  }
  /**
   * O(1) time.
   */
  public void enqueue(Object obj) throws FullQueueException{
    if (this.size() == this.capacity - 1){
      throw new FullQueueException("Queue is full");
    }
    else{
      Q[tail] = obj;
      tail = (tail+1) % this.capacity;
    }
  }
  /**
   * O(1) time.
   */
  public Object dequeue() throws EmptyQueueException{
    if (this.isEmpty()){
      throw new EmptyQueueException("Queue is empty");
    }
    else{
      Object deObj = Q[head];
      Q[head] = null; // dereference Q[head] for garbage collection.
      head = (head+1) % this.capacity;
      return deObj;
    }
  }




}
