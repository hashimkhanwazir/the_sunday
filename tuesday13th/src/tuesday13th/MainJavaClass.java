package tuesday13th;

import java.time.LocalDate;
import java.time.LocalTime;
import yourPackage.The_Class;
import middlePackage.TheClass;


public class MainJavaClass {
	
	public static void main(String []arg)
	{ 
	   System.out.println(Math.pow(3, 4));
	   System.out.println(LocalDate.now());
	   System.out.println(LocalTime.now());
	
	
	myPackage.TheClass theclass=new myPackage.TheClass();
	yourPackage.The_Class the_class = new yourPackage.The_Class();
	middlePackage.TheClass theclassMiddle= new middlePackage.TheClass();
	
	the_class.the_class_method();
	
	theclassMiddle.The_Class.the_class_method();
	
	
	}
}
	
	

