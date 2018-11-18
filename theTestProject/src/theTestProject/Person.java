package theTestProject;

public abstract class  Person {
	public String firstName;
	public String lastName;
	
	public Person()
	{}
	
	public Person(String firstName, String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public String toString()
	{
	  return  "That person is "+firstName+" "+lastName;  
	}

public void run()
{}
	

}
