import java.util.*;

public class Assignment1BDriver 
{

	public static void main(String[] args) {
		System.out.println(parenthesisMatch(userInput()));
	}

	public static String userInput() 
	{
		Scanner sc = new Scanner(System.in);

		return sc.nextLine();
	}

	public static boolean parenthesisMatch(String userInput) 
	{
		StackStack<String> stack = new StackStack<String>();

		// pushes a '(' to the stack
		try 
		{
			for (int x = 0; x < userInput.length(); x++)
			{	
				if (userInput.charAt(x) == '(') 
				{
					stack.push("(");
				}
				// pushes a '{' to the stack
				else if (userInput.charAt(x) == '{') 
				{
					stack.push("{");
				}
				// pushes a '[' to the stack
				else if (userInput.charAt(x) == '[') 
				{
					stack.push("[");
				}
				// these statements check for the corresponding opening bracket at
				// the top of the stack
				// and pops it if it it matches with the input
				else if (userInput.charAt(x) == ')') 
				{
					if (stack.top() == "(") 
					{
						stack.pop();
					}		
				}
				else if (userInput.charAt(x) == '}') 
				{
					if (stack.top() == "{") 
					{
					stack.pop();
					}				
				}  
				else if (userInput.charAt(x) == ']') 
				{
					if (stack.top() == "[") 
					{
						stack.pop();
					}
				}
			}
		} 
		catch (EmptyStackException E) 
			{
				System.out.println("The stack is empty");
				return false;
			}		
		
		if (stack.isEmpty())
		{
			System.out.print("The parenthesis match!");
			return true;
		} else {
			System.out.println("these parenthesis do not match!");
			return false;
		}
	}// method

}// class
