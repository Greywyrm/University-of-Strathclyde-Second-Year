
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDeque<E> implements DequeADT<E> 
{
	protected Deque<E>D;
	
	public DequeDeque()
	{
		Deque<E> D = new ArrayDeque<E>();
	}
	
	@Override
	public int size() {
		
		return D.size();
	}

	@Override
	public boolean isEmpty() {
		if(D.isEmpty())
		{
		return true;
		}
		else
		{
		return false;	
		}
		
	}

	@Override
	public void addFirst(E element) 
	{	
		D.addFirst(element);
	}

	@Override
	public void addLast(E element) 
	{
		D.addLast(element);	
	}

	@Override
	public E getFirst() 
	{	
		if(D.isEmpty())
		{
			throw new EmptyDequeException("The deque is empty");
		}
		else
		{
			return D.getFirst();
		}
	}

	@Override
	public E getLast() 
	{	
		if(D.isEmpty())
		{
			throw new EmptyDequeException("The deque is empty");
		}
		else
		{
			return D.getLast();
		}
	}

	@Override
	public E removeFirst() 
	{
		if(D.isEmpty())
		{
			throw new EmptyDequeException("The deque is empty");
		}
		else
		{
			return D.removeFirst();
		}
	}

	@Override
	public E removeLast() 
	{
		if(D.isEmpty())
		{
			throw new EmptyDequeException("The deque is empty");
		}
		else
		{
			return D.removeLast();
		}
	}

}
