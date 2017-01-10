import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Assignment2BDriver 
{
	
	static int[] unsortedArray = {1,400,55,2,7,23};
	
	
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter '1' to sort the preexisting array or '2' to generate a new array and then sort it");
		int input = sc.nextInt();
		
		if(input == 1)
		{
			quickSort sorter = new quickSort();
			sorter.sort(unsortedArray);
			System.out.println("Sorted Array: " + Arrays.toString(unsortedArray));
		}
		else if(input == 2)
		{
			quickSort sorter = new quickSort();
			unsortedArray = new int[60];
			fillRandomArray(unsortedArray);
			System.out.println("Unsorted Array: " + Arrays.toString(unsortedArray));
			sorter.sort(unsortedArray);
			System.out.println("Sorted Array: " + Arrays.toString(unsortedArray));
		}
		
		
		
	}




	private static void fillRandomArray(int[] unsortedArray) 
	{
		for(int i = 0; i < unsortedArray.length; i++)
		{
			Random rand = new Random();
			unsortedArray[i] = rand.nextInt(100);
		}
		
	}
	
	
	
	

}
