// LinkedList.java
// 
// This version uses three instance variables,
// a pointer to the first node, a pointer to
// the last node, and length, to make our
// append and getLength methods more efficient
// than the would be if our only instance
// variable were a pointer to the first node.
//
// This version uses a dummy first node.  Hence
// it needs less decision-making than it would
// need if a dummy first node were not used.
//

/**
 * Encapsulates a linked list of <code>String</code>.
 */
public class MoneyList {

	/** First node in linked list - dummy node */
	private MoneyNode first = new MoneyNode(null);

	/** Last node in linked list */
	private MoneyNode last = first;

	/** Number of data items in the list. */
	private int length = 0;

	public MoneyNode getFirst() {
		return first;
	}

	public void setFirst(MoneyNode first) {
		this.first = first;
	}

	/**
	 * Gets the number of data values currently stored in this LinkedList.
	 * 
	 * @return the number of elements in the list.
	 */

	public int getLength() {
		return length;
	}

	/**
	 * Appends a String data element to this LinkedList.
	 * 
	 * @param data
	 *            the data element to be appended.
	 */
	//append a new node to the end of the linked list
	//step1: create a new node
	//
	public void append(Money d) {
		// TODO Code here for append
		MoneyNode newNode=new MoneyNode(d);//create a new node
		last.next=newNode;
        last=newNode;
        length++;
	} // method append(String)

	/**
	 * Prepends (adds to the beginning) a String data element to this
	 * LinkedList.
	 * 
	 * @param data
	 *            the data element to be prepended.
	 */
	public void prepend(Money d) {
		// TODO Code here for prepend
       MoneyNode newNode=new MoneyNode(d);//step1: create a new node
       if(first.next==null)//empty linked list
    	   last=newNode;
       newNode.next=first.next;
       
       first.next=newNode;
       length++;
       
		
	} // method append(String)

	/**
	 * @return String representation of elements in linked list delimited by a
	 *         space character
	 */
	public String toString() {
		MoneyNode p = first.next;
		String returnString = "";
		while (p != null) {
			returnString += p.data + " ";
			p = p.next;
		}
		return returnString;
	}
	/**
	 * recursive print method
	 * @param n first.next
	 */
	public void print(MoneyNode n) {
		//base case: empty linked list
		if(n==null)
			return;
		//recursive steps
		System.out.println(n.data);
		print(n.next);
	}
	/**
	 * recursive print method in reverse order
	 * @param n first.next
	 */
	public void reversePrint(MoneyNode n) {
		//base case: empty linked list
		if (n==null)
			return;
		reversePrint(n.next);
		System.out.println(n.data);
	}
	

	/**
	 * Determines whether this ShortSequenceLinkedList is equal in value to the
	 * parameter object. They are equal if the parameter is of class
	 * ShortSequenceLinkedList and the two objects contain the same short
	 * integer values at each index.
	 * 
	 * @param other
	 *            the object to be compared to this ShortSequenceLinkedList
	 * 
	 * @return <code>true</code> if the parameter object is a
	 *         ShortSequenceLinkedList containing the same numbers at each index
	 *         as this ShortSequenceLinkedList, <code>false</code> otherwise.
	 */
	public boolean equals(Object other) { //list5.equals(m1)
		if (other == null || getClass() != other.getClass()
				|| length != ((MoneyList) other).length)
			return false;

		MoneyNode nodeThis = first;
		MoneyNode nodeOther = ((MoneyList) other).first;
		while (nodeThis != null) {
			// Since the two linked lists are the same length,
			// they should reach null on the same iteration.

			if (nodeThis.data != nodeOther.data)
				return false;

			nodeThis = nodeThis.next;
			nodeOther = nodeOther.next;
		} // while

		return true;
	} // method equals

	public double sum() {
		double s=0;
		MoneyNode p=first.next;
		while(p!=null) {
		if (p.data instanceof Bill)
			s+=((Bill)p.data).getValue();//dollar amount
		else //coin type
			s+=((Coin)p.data).getValue()/100.0;
			
		p=p.next;
		}
		return s;
		
	}
	/**
	 * recursive sum method
	 * @param n first.next
	 * @return sum of all the money object
	 */
	public double sumRecursive(MoneyNode n) {
		//base case: empty linked list
		if (n==null)
			return 0;
		if(n.data instanceof Bill)
			return ((Bill)n.data).getValue()+sumRecursive(n.next);
		else //coin type
		return	((Coin)n.data).getValue()/100.0+sumRecursive(n.next);
			
	}
	
	public double sumQuarter(MoneyNode n) {
		//base case: empty linked list
		if (n==null)
			return 0;
		if (n.data instanceof Quarter)
			return ((Quarter)n.data).getValue()/100.0+sumQuarter(n.next);
		else
			return sumQuarter(n.next);
	}
} // class LinkedList

