package theTestProject;

public class theTestProject {
	
	public static void main(String []args)
	{
		//Person person=new Person("John","Davidson");
		//the person class is abstract class so its objects cant be made
		Student student=new Student("John","Smith","10/2014");
		Professor professor=new Professor("Edwared","kelly","Programming in Java");
		Student nextStudent = new Student();
		Professor nextProfessor = new Professor();
		
//System.out.println(person);
System.out.println(student);
System.out.println(professor);
System.out.println(nextProfessor); // nil values as we have not passed any value

System.out.println("The sum of two doubles is "+nextStudent.add(13.4,23.4));
System.out.println("The sum of three doubles is "+nextStudent.add(13.4,45.6,78.9));

	
}
}
