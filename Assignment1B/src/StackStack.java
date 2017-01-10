import java.util.Stack;

public class StackStack<E> implements StackADT<E> 
{
	protected Stack<E>S;
	
	
	public StackStack() 
	{
		S = new Stack<E>();
	}


	public void push(E element) 
	{
		S.push(element);
	}

	
	public E pop() 
	{
		if(S.isEmpty())
		{
			throw new EmptyStackException("The stack is empty");			
		}
		else
		{
			return S.pop();
		}			
	}

	@Override
	public E top() 
	{	
		if(S.isEmpty())
		{
			throw new EmptyStackException("The stack is empty");			
		}
		else
		{
			return S.peek();
		}	 
	}

	@Override
	public int size() {
		
		return S.size();
	}

	@Override
	public boolean isEmpty() 
	{
		return S.empty();		
	}
	
	
}
