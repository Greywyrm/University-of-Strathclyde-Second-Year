import java.util.Scanner;


public class Assignment2ADriver 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome!  Please enter a number for the fibonacci sequence");
		int userInput = sc.nextInt();
		
		
		System.out.println("Please enter '1' if you would like recursion or '2' if you would like iteration.");
		int selector = sc.nextInt();
		
		
		if(selector == 1)
		{
			System.out.println(recursiveFibonacci(userInput));
		}
		else if(selector == 2)
		{
			System.out.println(iterativeFibonacci(userInput));
		}
		else
		{
			System.out.println("You have entered an invalid character.  The program will now close");
		}

	}

protected static int recursiveFibonacci(int input)
{
	if(input == 0)
	{
		return 0;
	}
	else if (input == 1)
	{
	return 1;
	}
	else
	{
		return recursiveFibonacci(input - 1) + recursiveFibonacci(input - 2);
	}
	
	
}

protected static int iterativeFibonacci(int input)
{
	int x = 0, y = 1, z = 1;
	
	for(int i = 0; i < input; i++)
	{
		x = y;
		y = z;
		z = x + y;
	}	
	return x;
}

}