package TestStackOfIntegers;

/**
 * Created by RavelShen on 18/1/2016.
 */
public class TestStackOfIntegers {
  public static void main(String[] args){
    StackOfIntegers stack = new StackOfIntegers();
    for (int i = 0; i < 10; i++){
      if(i<=stack.MAX_SIZE){
        stack.push(i);
      }
      else{
        System.out.println("out of size");
        break;
      }

    }
    while (!stack.empty()){
      System.out.print(stack.pop() + " ");
    }
  }
}
