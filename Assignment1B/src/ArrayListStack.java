import java.util.ArrayList;

public class ArrayListStack<E> implements StackADT<E> 
{
	protected ArrayList<E> S;
	
	public ArrayListStack()
	{
		S = new ArrayList<E>();
	}
	
	public void push(E element) 
	{
		S.add(element);
	}

	public E pop() 
	{
		if(S.isEmpty())
		{
			throw new EmptyStackException("The stack is empty");			
		}
		else
		{
			return S.remove(S.size()-1);			
		}			
	}
	
	public E top() 
	{	
		if(S.isEmpty())
		{
			throw new EmptyStackException("The stack is empty");			
		}
		else
		{
			return S.get(S.size()-1);
		}	 
	}

	public int size() {
		
		return S.size();
	}

	@Override
	public boolean isEmpty() 
	{
		return S.isEmpty();		
	}
}
