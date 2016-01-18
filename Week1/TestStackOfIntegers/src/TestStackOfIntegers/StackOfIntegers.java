package TestStackOfIntegers;

/**
 * Created by RavelShen on 18/1/2016.
 */
public class StackOfIntegers {
  private int[] elements;
  private int size;
  public static final int MAX_SIZE = 16;

  public StackOfIntegers(){
    this(MAX_SIZE);
  }

  public StackOfIntegers(int capacity){
    elements = new int[capacity];
  }

  public int push(int value){
    if (size >= elements.length){
      int[] temp = new int[elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }

    return elements[size++] = value;
  }

  public int pop(){
    return elements[--size];
  }

  public int peek(){
    return elements[size - 1];
  }

  public boolean empty(){
    return size == 0;
  }

  public int getSize(){
    return size;
  }
}
