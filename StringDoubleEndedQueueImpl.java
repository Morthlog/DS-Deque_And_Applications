import java.util.*;
import java.io.PrintStream;

public class  StringDoubleEndedQueueImpl<T> implements StringDoubleEndedQueue<T> 
{
    private Node<T> head = null;
    private Node<T> tail = null;

    public boolean isEmpty()
    {
        return head == null;
    }

	/**
	 * insert an object of type T item at the front of the queue
	 */	
	public void addFirst(T item)
	{
        Node<T> n = new Node<>(item);

        if (isEmpty()) {
            head = n;
            tail = n;
        } 
        else 
        {
            n.setNext(head);
            head = n;
        }
    }

	/**
	 * remove and return the item at the front of the queue
	 * @return object of type T from the front of the queue
	 * @throws NoSuchElementException if the queue is empty
	 */
	public T  removeFirst() throws NoSuchElementException
	{
		T data = null;
        return data;
    }

	/**
	 * insert an object of type T item at the end of the queue
	 */
	public void addLast(T item)
	{

    }

	/**
	 * remove and return the item at the end of the queue
	 * @return Object of type T from the end of the queue
	 * @throws NoSuchElementException if the queue is empty
	 */
	public T removeLast() throws NoSuchElementException
	{
		T data = null;
        return data;
    }
	
	/**
	 * return without removing the item at the front of the queue
	 * @return Object of type T from the front of the queue
	 * @throws NoSuchElementException if the queue is empty
	 */
	public T getFirst()
	{
    	T data = null;
        return data;
    }

	/**
	 * return without removing the item at the end of the queue
	 * @return Object of type T from the end of the queue
	 * @throws NoSuchElementException if the queue is empty
	 */
	public T getLast()
	{
       	T data = null;
        return data;
    }
	
	
	/**
	 * print the objects of type T items of the queue, starting from the front, 
     	 * to the print stream given as argument. For example, to 
         * print the elements to the
	 * standard output, pass System.out as parameter. E.g.,
	 * printQueue(System.out);
	 */
	public void printQueue(PrintStream stream)
	{

    }


	/**
	 * return the size of the queue, 0 if empty
	 * @return number of elements in the queue
	 */
	public int size()
	{
        return 0;
    }
}

