
public class testCircle {

	public static void main(String[] args)
	{
		
	/////////////////////////////////////////////////////////////////////
		Circle c1=new Circle();
		
		System.out.println("The radius of the circle No. 1 is "+c1.getRadius()
				+ " and the Area of the Circle is "+c1.getArea());
		
		//System.out.println("The Color of the circle No. 1 is "+c1.color);
	////////////////////////////////////////////////////////////////////////////
		
		Circle c2=new Circle(2.0);	
		System.out.println("The radius of the circle No. 2 is "+c2.getRadius()
		+ " and the Area of the Circle No. 2 is "+c2.getArea());
		
		c2.setColor("IndegO");
		
		//System.out.println("The Color of the circle No. 2 is "+c2.color);
		
	//////////////////////////////////////////////////////////////////////////////
		
		Circle c3=new Circle(4.0,"BLACK");
		System.out.println("The radius of the circle No. 3 is "+c3.getRadius()
		+ " and the Area of the Circle No. 3 is "+c3.getArea());
		
//	Circle c4=new Circle(); 
	//	System.out.println("The Color of the circle No. 4 is "+c4.getColor("BROWN")
		//+ " and the Area of the Circle No. 4 is "+c4.getArea());
		
		Circle c5=new Circle();
		c5.setRadius(5.0);
		c5.setColor("Orange");
		System.out.println("The radius of the 5th instance is "+c5.getRadius()+
				" and the color of the 5th instance is "+c5.getColor());
		
		System.out.println(c3.toString());   // explicit call
		
		//Now lets call it implecitly
		
		c2.toString();
		System.out.println(c2);
		System.out.println(""+c2);//Operator + also also for the purpose to invoke the toString method
		
	
		
		
		
	

   //     System.out.println("The Color of the circle No. 3 is "+c3.color);
				
	///////////////////////////////////////////////////////////////////////////////
        
      //   System.out.println(" the radius is "+c3.radius);
		
		
		
		
		
		
	}
}
