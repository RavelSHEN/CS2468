public class DList 
{
	public static void main(String args[]) 
	{
		DList test = new DList();
		test.insertFirst(5);
		test.insertFirst(4);
		test.insertFirst(3);
		System.out.println(test.toString());
	}
	  protected int numElts;            	// Number of elements in the list
	  protected DNode header, tailer;	// Special sentinels
	  /** Constructor that creates an empty list; O(1) time */
	  public DList() {
	    numElts = 0;
	    header = new DNode(null, null, null);	// create header
	    tailer = new DNode(header, null, null);	// create tailer
	    header.setNext(tailer);	// make header and tailer point to each other
	  }

	  /** Returns the number of elements in the list;  O(1) time */
	  public int size() { return numElts; }
	  /** Returns whether the list is empty;  O(1) time  */
	  public boolean isEmpty() { return (numElts == 0); }
	  /** Returns the first position in the list; O(1) time */
	  public DNode first(){
	    return header.getNext();
	  }
	  /** Returns the last position in the list; O(1) time */
	  public DNode last() {
	    return tailer.getPrev();
	  }
	  /** Returns the position before the given one; O(1) time */
	  public DNode prev(DNode p) {
	    DNode prev = p.getPrev();
	    return prev;
	  }
	  /** Returns the position after the given one; O(1) time */
	  public DNode next(DNode p) {
	    DNode next = p.getNext();
	    return next;
	  }

	  /** Insert the given element after the given position, returning the
	    * new position; O(1) time  */
	  public DNode insertAfter(DNode p, Object element)  {
	    numElts++;
	    DNode newNode = new DNode(p, element, p.getNext());
	    p.getNext().setPrev(newNode);
	    p.setNext(newNode);
	    return newNode;
	  }
	  /** Insert the given element at the beginning of the list, returning
	    * the new position; O(1) time  */
	  public DNode insertFirst(Object element) {
	    numElts++;
	    DNode newNode = new DNode(header, element, header.getNext());
	    header.getNext().setPrev(newNode);
	    header.setNext(newNode);
	    return newNode;
	  }
	  /** Insert the given element at the end of the list, returning
	    * the new position; O(1) time  */
	  public DNode insertLast(Object element) {
	    numElts++;
	    DNode oldLast = tailer.getPrev();
	    DNode newNode = new DNode(oldLast, element, tailer);
	    oldLast.setNext(newNode);
	    tailer.setPrev(newNode);
	    return newNode;
	  }
	  /**Remove the given position from the list; O(1) time */
	  public Object remove(DNode p) {
	    numElts--;
	    DNode pPrev = p.getPrev();
	    DNode pNext = p.getNext();
	    pPrev.setNext(pNext);
	    pNext.setPrev(pPrev);
	    Object pElem = p.getElement();
	    // unlink the position from the list and make it invalid
	    p.setNext(null);
	    p.setPrev(null);
	    return pElem;
	  }
	  /** Replace the element at the given position with the new element
	    * and return the old element; O(1) time  */
	  public Object replace(DNode p, Object element) {
	    Object oldElt = p.getElement();
	    p.setElement(element);
	    return oldElt;
	  }

	  // Convenience methods
	  /** Returns whether a position is the first one;  O(1) time */
	  public boolean isFirst(DNode p) {  
	    return p.getPrev() == header;
	  }
	  /** Returns whether a position is the last one;  O(1) time */
	  public boolean isLast(DNode p) {  
	    return p.getNext() == tailer;
	  }
	  /** Swap the elements of two give positions;  O(1) time */ 
	  public void swapElements(DNode a, DNode b) {
	    Object temp = a.getElement();
	    a.setElement(b.getElement());
	    b.setElement(temp);
	  }
	  /** Returns a textual representation of the list */
	  public String toString() {
	    String s = "[";
	    if (!isEmpty()) {
	    	DNode p = first();
	    	while (true) {
	    		s += p.getElement();
	    		if (p==last())
	    			break; 
	    		s += ", ";
	    		p = next(p);
	    	}
	    }
	    s += "]";
	    return s;
	  }
}
 
class DNode {
    private  DNode prev;
	private  Object element;
    private  DNode next;

    /** Creates a node with null references to its element and next node. */
    public  DNode() {
       this(null, null, null);
   }
    /** Creates a node with the given element and next node. */
    public  DNode(DNode p, Object e,  DNode n)  {
        prev  =  p;
    	element  =  e;
         next  =  n;
   }
    // Accessor methods:
    public  Object getElement()  {
       return  element;
   }
    public  DNode getNext()  {
       return  next;
   }
    public  DNode getPrev()  {
        return  prev;
    }
    // Modifier methods:
    public void  setElement(Object newElem)  {
         element  =  newElem;
   }
    public void  setNext(DNode newNext)  {
         next  =  newNext;
   }
    
    public void  setPrev(DNode newPrev)  {
        prev  =  newPrev;
  }
}
