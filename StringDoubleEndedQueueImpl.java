import java.util.*;
import java.io.PrintStream;

public class  StringDoubleEndedQueueImpl<T> implements StringDoubleEndedQueue {
    private Node<T> head = null;
    private Node<T> tail = null;

    
    public <T> boolean isEmpty(){
        return head == null;
    }

	/**
	 * insert a String item at the front of the queue
	 */
	public <T> void addFirst(T item){
        Node<T> n = new Node<>(item);

        if (isEmpty()) {
            head = n;
            tail = n;
        } else {
            n.setNext(head);
            head = n;
        }
    }

	/**
	 * remove and return the item at the front of the queue
	 * @return String from the front of the queue
	 * @throws NoSuchElementException if the queue is empty
	 */
	public <T> String removeFirst() throws NoSuchElementException{
        return "";
    }

	/**
	 * insert a String item at the end of the queue
	 */
	public <T> void addLast(T item){

    }

	/**
	 * remove and return the item at the end of the queue
	 * @return String from the end of the queue
	 * @throws NoSuchElementException if the queue is empty
	 */
	public <T> String removeLast() throws NoSuchElementException{
        return "";
    }
	
	/**
	 * return without removing the item at the front of the queue
	 * @return String from the front of the queue
	 * @throws NoSuchElementException if the queue is empty
	 */
	public <T> String getFirst(){
    
        return "";
    }

	/**
	 * return without removing the item at the end of the queue
	 * @return String from the end of the queue
	 * @throws NoSuchElementException if the queue is empty
	 */
	public <T> String getLast(){
        return "";
    }
	
	
	/**
	 * print the String items of the queue, starting from the front, 
     	 * to the print stream given as argument. For example, to 
         * print the elements to the
	 * standard output, pass System.out as parameter. E.g.,
	 * printQueue(System.out);
	 */
	public void printQueue(PrintStream stream){

    }


	/**
	 * return the size of the queue, 0 if empty
	 * @return number of elements in the queue
	 */
	public <T> int size(){
        return 0;
    }




}


// import edu.aueb.ds.exceptions.EmptyListException;

// import java.util.Comparator;

// /**
//  * Single-link List. Uses {@link Node} for list nodes.
//  */
// public class List<T> implements ListInterface<T> {

//     private Node<T> head = null;
//     private Node<T> tail = null;

//     /**
//      * Default constructor
//      */
//     public List() {
//     }

//     /**
//      * Determine whether list is empty
//      *
//      * @return true if list is empty
//      */
//     @Override
//     public boolean isEmpty() {
//         return head == null;
//     }

//     /**
//      * Inserts the data at the front of the list
//      *
//      * @param data the inserted data
//      */
//     @Override
//     public void insertAtFront(T data) {
//         Node<T> n = new Node<>(data);

//         if (isEmpty()) {
//             head = n;
//             tail = n;
//         } else {
//             n.setNext(head);
//             head = n;
//         }
//     }

//     /**
//      * Inserts the data at the end of the list
//      *
//      * @param data the inserted item
//      */
//     @Override
//     public void insertAtBack(T data) {
//         Node<T> n = new Node<>(data);


// import java.io.PrintStream;
// import java.util.Comparator;
// import java.util.NoSuchElementException;

// import org.w3c.dom.Node;
//             tail = n;
//         } else {
//             tail.setNext(n);
//             tail = n;
//         }
//     }

//     /**
//      * Returns and removes the data from the list head
//      *
//      * @return the data contained in the list head
//      * @throws EmptyListException if the list is empty
//      */
//     @Override
//     public T removeFromFront() throws EmptyListException {
//         if (isEmpty())
//             throw new EmptyListException();

//         T data = head.getData();

//         if (head == tail)
//             head = tail = null;
//         else
//             head = head.getNext();

//         return data;
//     }

//     /**
//      * Returns and removes the data from the list tail
//      *
//      * @return the data contained in the list tail
//      * @throws EmptyListException if the list is empty
//      */
//     @Override
//     public T removeFromBack() throws EmptyListException {
//         if (isEmpty())
//             throw new EmptyListException();

//         T data = tail.getData();

//         if (head == tail)
//             head = tail = null;
//         else {
//             Node<T> iterator = head;
//             while (iterator.getNext() != tail)
//                 iterator = iterator.getNext();

//             iterator.setNext(null);
//             tail = iterator;
//         }

//         return data;
//     }

//     /**
//      * Returns list as String
//      */
//     @Override
//     public String toString() {
//         if (isEmpty()) {
//             return "List is empty :(";
//         }

//         Node current = head;

//         StringBuilder ret = new StringBuilder();

//         // while not at end of list, output current node's data
//         ret.append("\n\nHEAD -> ");

//         while (current != null) {
//             ret.append(current.data.toString());

//             if (current.getNext() != null)
//                 ret.append(" -> ");

//             current = current.next;
//         }

//         ret.append(" <- TAIL");

//         return ret.toString();
//     }

//     /**
//      * Sorts the list
//      *
//      * @param comparator
//      */
//     @Override
//     public void sort(Comparator<T> comparator) {
//         /* Sort the whole list...
	
// 	**** ADD CODE HERE ****
		
// 	*/
        
//     }
// }
