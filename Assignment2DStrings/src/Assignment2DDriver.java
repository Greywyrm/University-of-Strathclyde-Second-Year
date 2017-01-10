import java.util.Scanner;

public class Assignment2DDriver {

	public static void main(String[] args) 
	{
		BinarySearchTree bst = new BinarySearchTree();
		bst.add("Hello");
		bst.add("There");
		bst.add("This");
		bst.add("Program");
		bst.add("Definitely");
		bst.add("Does");
		bst.add("Work");
		bst.add("!");

		Scanner sc = new Scanner(System.in);
		int userInput;
		
		do
		{

		System.out.println("Welcome!");
		System.out.println("Please enter '1' to add a string to the tree.");
		System.out.println("Enter '2' to delete a string from the tree.");
		System.out.println("Enter '3' to search the tree for a string.");
		System.out.println("Enter '4' to display the strings held in the tree");
		System.out.println("Finally, enter '5' to exit the program");
		userInput = sc.nextInt();

		if (userInput < 1 || userInput > 5) 
		{
			System.out.println("Invalid input.  The program will now exit");
		} 
		else if (userInput < 4) 
		{
			
			System.out.println("Please enter the string");
			String input = sc.nextLine();
			input = sc.nextLine();

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

	public static void addValue(String input, BinarySearchTree bst) {
		bst.add(input);
		System.out.println(input + " has been added to the tree!");
		System.out.println("");
	}

	public static void removeValue(String input, BinarySearchTree bst) {
		bst.remove(input);
		System.out.println(input + " has been removed from the tree!");
		System.out.println("");
	}

	public static void searchTree(String input, BinarySearchTree bst) {
		System.out.println(bst.search(input));
		System.out.println("");
	}

	public static void displayTree(BinarySearchTree bst) {
		bst.displayInOrder(bst.getRoot());
		System.out.println("");
	}

}
