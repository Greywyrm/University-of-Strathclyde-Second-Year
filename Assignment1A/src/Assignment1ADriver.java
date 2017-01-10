import java.util.*;
public class Assignment1ADriver {
	
	

	public static void main(String[] args) 
	{
		runStack();
	}

	public static void runStack()
	{
		StackADT<String> stack = new ArrayStack<String>();
		Scanner sc = new Scanner(System.in);
		String userInput;
				
		do
		{
				
		System.out.println("Welcome!  this program will allow you to interact with a stack!");
		System.out.println("Please type 'push' to input a new string to the stack");
		System.out.println("Please type 'pop' to remove the top string from the stack");
		System.out.println("Please type 'size' to return the current size of the stack");
		System.out.println("Please type 'empty' to check if the stack is empty");
		System.out.println("please type 'top' to see the top element in the stack");
		System.out.println("Please type 'quit' to exit the program");
	    userInput = sc.nextLine();
		
	   switch (userInput) 
		{
	   case "push": 
		   System.out.println("Please enter the string you would like pushed");
	       String temp = sc.nextLine();  
	       try
	       {
	    	  stack.push(temp); 
	    	  System.out.println(temp + " successfully pushed to stack");
			   System.out.println("");
	       }
	       catch(FullStackException e) 
		   {
			   System.out.println("Stack is full, so we cannot push the stack");
			   System.out.println("");
		   } 
		   	   		   		   
	    break;
	    
	   case "pop": 
	   try
	   {
		   
		 System.out.println("Popping  string '" + stack.top() + "'  from stack");
		 System.out.println("");
		 stack.pop();
	   }
	   catch(EmptyStackException e) 
	   {
		   System.out.println("Stack is empty, so we cannot pop from the stack");
		   System.out.println("");
	   } 
	   
	    break;
	    
	   case "empty": 
		   if (stack.isEmpty())
		   {
		   System.out.println("The stack is currently empty");
		   }
		   else
		   {
		  System.out.println("The stack is not currently empty");
		   }
		   	System.out.println("");
		   
	   
	    break;
	   
	   case "size": System.out.println("The stack is currently size: " + stack.size());
	   System.out.println("");
	    break;
		
	   case "top": System.out.println("The top element in the stack is " + stack.top());
	   System.out.println("");	   
	   
		}	
	   
		}while (!userInput.equals("quit"));
		
		System.out.println("Thank you for using this program!");
	}
}
