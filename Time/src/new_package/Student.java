package new_package;

public class Person extends Student {

	public String indexNumber;
	
	public Student(String firstName, String lastName, String indexNumber)
	{
		super(firstName,lastName);
		this.indexNumber=indexNumber;
	}
	
}
