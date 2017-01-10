import java.util.Scanner;

public class Assignment2DDriver {

	public static void main(String[] args) 
	{
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(1);
		bst.add(5);
		bst.add(300);
		bst.add(16);
		bst.add(3);
		bst.add(30);
		bst.add(17);
		bst.add(-3);

		Scanner sc = new Scanner(System.in);
		int userInput;
		
		do
		{

		System.out.println("Welcome!");
		System.out.println("Please enter '1' to add a value to the tree.");
		System.out.println("Enter '2' to delete a value from the tree.");
		System.out.println("Enter '3' to search the tree for a value.");
		System.out.println("Enter '4' to display the values held in the tree");
		System.out.println("Finally, enter '5' to exit the program");
		userInput = sc.nextInt();

		if (userInput < 1 || userInput > 5) 
		{
			System.out.println("Invalid input.  The program will now exit");
		} 
		else if (userInput < 4) 
		{

			System.out.println("Please enter the value");
			int input = sc.nextInt();

			{
				switch (userInput) 
				{
				case 1:
					userInput = 1;
					addValue(input, bst);
					break;
				case 2:
					userInput = 2;
					removeValue(input, bst);
					break;
				case 3:
					searchTree(input, bst);

				}
			}
		}
		else if (userInput == 4)
		{
			displayTree(bst);
		}
		
		}
		while(userInput != 5);

	}

	public static void addValue(int input, BinarySearchTree bst) {
		bst.add(input);
		System.out.println(input + " has been added to the tree!");
		System.out.println("");
	}

	public static void removeValue(int input, BinarySearchTree bst) {
		bst.remove(input);
		System.out.println(input + " has been removed from the tree!");
		System.out.println("");
	}

	public static void searchTree(int input, BinarySearchTree bst) {
		System.out.println(bst.search(input));
		System.out.println("");
	}

	public static void displayTree(BinarySearchTree bst) {
		bst.displayInOrder(bst.getRoot());
		System.out.println("");
	}

}
