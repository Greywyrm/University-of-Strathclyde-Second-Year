import java.util.Stack;

public class quickSort 
{
	public quickSort()
	{
		
	}
	
	
	@SuppressWarnings("unchecked")
	public static void sort(int[] userInput)
	{	
		Stack sortingStack = new Stack();
		sortingStack.push(0);
		sortingStack.push(userInput.length);
		
		
		
		while(!sortingStack.isEmpty())
		{
			int end = (int) sortingStack.pop();
			int start = (int) sortingStack.pop();
			if(end - start < 2)
			{
				continue;
			}
			
			int pivot = start + ((end - start) / 2);
			pivot = splitArray(userInput, pivot, start, end);
			
			sortingStack.push(pivot + 1);
			sortingStack.push(end);
			
			sortingStack.push(start);
			sortingStack.push(pivot);
		}
			
		}
			
			private static int splitArray(int[] userInput, int position, int start, int end) {
		        int low = start;
		        int head = end - 2;
		        int pivot = userInput[position];
		        swap(userInput, position, end - 1);

		        while (low < head) 
		        {
		            if (userInput[low] < pivot) {
		                low++;
		            } else if (userInput[head] >= pivot) {
		                head--;
		            } else {
		                swap(userInput, low, head);
		            }
		        }
		        int index = head;
		        if (userInput[head] < pivot) {
		            index++;
		        }
		        swap(userInput, end - 1, index);
		        return index;
		    }


		    private static void swap(int[] userInput, int i, int index) {
		        int temp = userInput[i];
		        userInput[i] = userInput[index];
		        userInput[index] = temp;
		    }
}
