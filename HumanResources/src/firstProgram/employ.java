package firstProgram;

public class employ
{
	
	static int name1;
	static String age1;
	static int salary1;
	
	static employ hashim = new employ();
	static employ Ali = new employ();
	static employ Manzoor = new employ();

	public int salary(int sal)
	{
		int salary1=sal;
	  return salary1;
	}
	
	 public String name(String emp)
	{
		String name1=emp;
		return name1;
	}
	
	public int age()
	{
		int age1=34;
		return age1;
	}
	
	     
	
	public static void main (String [] args)
	{
		hashim.name("Hashim Khan Waizr");
		hashim.age();
		hashim.salary(450000);
		
		System.out.println("The employ named"+name1+"has age "+age1+"and having salary equal to "+salary1);
		
		Ali.name("Hashim Khan Waizr");
		Ali.age();
		Ali.salary(460000);
		
		System.out.println("The employ named"+name1+"has age"+age1+"and having salary equal to"+salary1);
		
		Manzoor.name("Hashim Khan Waizr");
		Manzoor.age();
		Manzoor.salary(470000);
		
		System.out.println("The employ named"+name1+"has age "+age1+"and having salary equal to "+salary1);
		
	        
	    }
	}
