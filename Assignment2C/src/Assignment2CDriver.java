import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment2CDriver 
{

	public static void main(String[] args) throws IOException 
	{
		List<Person> personList = new ArrayList<Person>();

		try 
		{
			FileReader fr = new FileReader("People2.txt");
		
			BufferedReader reader = new BufferedReader(fr);
			String line = reader.readLine();

			while (line != null) 
			{
				
				Scanner sc = new Scanner(line);
				try 
				{
					String sur = sc.next();
					String name = sc.next();
					double sal = sc.nextDouble();
					line = reader.readLine();
					Person person = new Person(sur, name, sal);
					personList.add(person);
				} 
				catch (Exception e) 
				{
					System.out.println("Insufficient data has been entered.  The program will display all correct data and then close.");
					break;
				}

			}

		} catch (FileNotFoundException e) 
		{
			System.out.println("File not found");
		}

		for (Person p : personList)

		{
			System.out.println(p.getFirstName() + " " + p.getSurname() + " " + p.getSalary());
						
		}
		
		System.out.println("");
		Collections.sort(personList);
		
		for (Person p : personList)

		{
			System.out.println(p.getFirstName() + " " + p.getSurname() + " " + p.getSalary());
						
		}
		
	}

}
