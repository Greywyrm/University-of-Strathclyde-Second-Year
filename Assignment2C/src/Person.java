
public class Person implements Comparable<Person> 
{
	private String surname;
	private String firstName;
	private double salary;

	public Person() 
	{

	}

	public Person(String sur, String name, double sal) 
	{
		surname = sur;
		firstName = name;
		salary = sal;
	}

	public String getSurname() 
	{
		return surname;
	}

	public void setSurname(String surname) 
	{
		this.surname = surname;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public double getSalary() 
	{
		return salary;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	@Override
	public int compareTo(Person p) 
	{
		if (this.getSurname().compareTo(p.getSurname()) == 0) 
		{
			return this.getFirstName().compareTo(p.getFirstName());
		} 
		else 
		{
			return this.getSurname().compareTo(p.getSurname());
		}
	}

}
