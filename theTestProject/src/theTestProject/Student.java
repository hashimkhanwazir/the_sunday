package theTestProject;

public class Student extends Person {
	
public String indexNumber;

public Student()
{}

	public Student(String firstName, String lastName, String indexNumber)
	{
		super(firstName, lastName);
		this.indexNumber=indexNumber;
	}
	
	//overriding 
	public String toString()
	{
	  return  "The student "+firstName+" "+lastName+" has index No. = "+indexNumber;  
	}
	
	//overloading
	
	public double add(double a, double b)
	{
		return a+b;
	}
	
	public double add(double a, double b, double c)
	{
		return a+b+c;
	}

}
