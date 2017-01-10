
public class NodeQueue<E> implements QueueADT<E> {

	protected Node<E> head;
	protected Node<E> tail;
	protected int size = 0;
	
	public NodeQueue() 
	{
		head = null;
		tail = null;
		
	}
	
	public void enqueue(E element) 
	{
		if (isEmpty()) 
		{
			head = new Node<E> (element, null);
			tail = head;
		}
		else 
		{
			tail.setNext(new Node<E>(element, tail));
			tail = tail.getNext();
		}
		size ++;

	}

	
	public E dequeue() 
	{
		if(isEmpty())
		{
			throw new EmptyQueueException("Queue is empty");
		}
		size--;
		E return_elem = head.getElement();
		head = head.getNext();
		return return_elem;		
	}

	@Override
	public E front() 
	{
		if (isEmpty()) 
		{
			throw new EmptyQueueException("Empty");
		}
		
		return head.getElement();
		
	}

	@Override
	public int size() 
	{
		return size;
	}

	@Override
	public boolean isEmpty() 
	{		
		return (size == 0);
	}

}
