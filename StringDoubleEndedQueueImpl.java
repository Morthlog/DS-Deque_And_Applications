import java.util.*;
import java.io.PrintStream;
import java.rmi.server.UnicastRemoteObject;

public class  StringDoubleEndedQueueImpl<T> implements StringDoubleEndedQueue<T> 
{
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size=0;
    
    public boolean isEmpty()
    {
        return head == null;
    }

    /**
	 * inserts data of type T at the front of the queue
	 */	
	public void addFirst(T data)
	{
        Node<T> n = new Node<>(data);

        if (isEmpty()) 
        {
            head = n;
            tail = n;
        } 
        else 
        {
            n.setNext(head);
            head = n;
        }
        size++;
    }

	/**
	 * removes and returns the data at the front of the queue
	 * @return data of type T from the front of the queue
	 * @throws NoSuchElementException if the queue is empty
	 */
	public T  removeFirst() throws NoSuchElementException
	{
		if (isEmpty()) 
		{  
			throw new NoSuchElementException(); 
		}
          
        T data = head.getData();

        if (head == tail)
        {
        	 head = tail = null;
        }
           
        else
        {
        	head = head.getNext();
        }
          
        size--;
        return data;
    }

	/**
	 * inserts data of type T at the end of the queue
	 */
	public void addLast(T data)
	{
		Node<T> n = new Node<T>(data);

        if (isEmpty()) 
        {
            head = n;
            tail = n;
        } 
        else 
        {
            tail.setNext(n);
            tail = n;
        }
    }

	/**
	 * removes and returns the data from the end of the queue
	 * @return data of type T from the end of the queue
	 * @throws NoSuchElementException if the queue is empty
	 */
	public T removeLast() throws NoSuchElementException
	{
		if (isEmpty())
		{
			 throw new NoSuchElementException();
		}
          
        T data = tail.getData();

        if (head == tail)
        {
        	 head = tail = null;
        }
           
        else 
        {
            Node<T> iterator = head;
            while (iterator.getNext() != tail)
            {
            	 iterator = iterator.getNext();
            }
              
            iterator.setNext(null);
            tail = iterator;
        }

        return data;
    }
	
	/**
	 * returns without removing the data at the front of the queue
	 * @return data of type T from the front of the queue
	 * @throws NoSuchElementException if the queue is empty
	 */
	public T getFirst()
	{
    	if(head!=null)
    	{
    		return head.getData();
    	}
		return null;    	
    }

	/**
	 * returns without removing the data from the end of the queue
	 * @return data of type T from the end of the queue
	 * @throws NoSuchElementException if the queue is empty
	 */
	public T getLast()
	{
		if(tail!=null)
    	{
    		return tail.getData();
    	}
		return null;
    }
	
	
	/**
	 * prints the data of the queue, starting from the front, 
     	 * to the print stream given as argument. For example, to 
         * print the elements to the
	 * standard output, pass System.out as parameter. E.g.,
	 * printQueue(System.out);
	 */
	public void printQueue(PrintStream stream)
	{
		if (isEmpty()) 
		{
			stream.print("List is empty");
			return;
		}

		Node<T> current = head;
		
		StringBuilder message = new StringBuilder();
		
		// while not at end of list, output current node's data
		message.append("\n\nHEAD -> ");
		
		while (current != null) 
		{
			message.append(current.getData().toString());
		
		    if (current.getNext() != null)
	        {
		    	message.append(" -> ");
	        }
		
		    current = current.next;
		}
		
		message.append(" <- TAIL");
		stream.print(message);
    }


	/**
	 * returns the size of the queue, 0 if empty
	 * @return number of elements in the queue
	 */
	public int size()
	{
        return size;
    }
}

