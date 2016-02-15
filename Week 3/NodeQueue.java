
/**
 * Realization of a queue by means of a singly-linked list of nodes.
 * All operations are performed in constant time.
 *
 * @author Roberto Tamassia
 */

public class NodeQueue implements Queue {

  protected Node head, tail;  // the head and tail nodes
  protected int size;         // Keeps track of number of elements in queue

  /** Creates an empty queue. */
  public NodeQueue() {
    head = null;
    tail = null;
    size = 0;
  }
  
  public int size() {       //# Return the current queue size
    return size;
  }
  
  public boolean isEmpty() {      //# Returns true iff queue is empty
    if ( (head==null) && (tail==null) )
      return true;
    return false;
  }

  public void enqueue(Object obj) {
    Node node = new Node();
    node.setElement(obj);
    node.setNext(null); // node will be new tail node
    if (size == 0)
      head = node; // special case of a previously empty queue
    else
      tail.setNext(node); // add node at the tail of the list
    tail = node; // update the reference to the tail node
    size++;
  }

  public Object front()     //# Return the first queue element
    throws Exception {
    if (size == 0)
      throw new Exception("Queue is empty.");
    return head.getElement();
  }
  
  public Object dequeue() throws Exception {
    if (size == 0)
      throw new Exception("Queue is empty.");
    Object obj = head.getElement();
    head = head.getNext();
    size--;
    if (size == 0)
      tail = null; // the queue is now empty
    return obj;
  }

  public String toString() {
    String s = "";
    s += "(";
    if (!isEmpty()) {
      Node p = head;
      do {
	s += p.getElement() ;
	if (p != tail)
	  s += ", ";
	p = p.getNext();
      } while (p != null); 
    }
    s += ")";
    return s;
  }
  
}
