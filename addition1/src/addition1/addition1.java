
package addition1;
import java.util.Scanner;
import addition1.New_class;


public class addition1 {
	
	addition1(){}
	
	public int the_sum(int a, int b)
	{ 
		int sum;
		sum=a+b;
		return sum;
	}

	
	public static void main(String[] args)
	
	{
		int product, sum;
		//Scanner input = new Scanner(System.in);
		//int number1;
		//int number2;
		
		
		//System.out.print("Enter the first No. ");
		//number1=input.nextInt();
		//System.out.print("Enter the second No. ");
		//number2=input.nextInt();
		
	//	sum=number1+number2;
		
		
		//System.out.println("the product of the two numbers is "+(number1*number2));
		//System.out.println(number1*number1);
		
	    addition1 student1=new addition1();
	    addition1 student2=new addition1(); 
	    New_class student3=new New_class();
	    New_class student4=new New_class();
	
	    
	  
		sum=student1.the_sum(12,34);
		System.out.println("the sum of the two numbers is  "+sum);
		
		sum=student2.the_sum(34,56);
		System.out.println("the sum of the two numbers second is  "+sum);
		
		product=student1.the_mult(12,34);
		System.out.println("the sum of the two numbers is  "+product);
		
		product=student2.the_mult(34,56);
		System.out.println("the sum of the two numbers second is  "+product);
		
		
	
		
	}
	
}
	


		

