/**
 * Runtime exception thrown when one tries to insert a Node into a full tree
 * @author Yong Yang
 */

public class FullStackException extends RuntimeException {  
  public FullStackException (String err) {
    super(err);
  }
}
