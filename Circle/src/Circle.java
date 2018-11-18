
public class Circle {
	
	private double radius;
	private String color;
	////////////////CONSTRUCTOR 1
	Circle()
	{
		color="RED";
		radius=1.0;
	}
	//////////////////CONSTRUCTOR 2	
	Circle(double r)
	{
		color="RED";
		radius=r;
	}
	//////////////////CONSTRUCTOR 3
	
	Circle(double r, String c)
	{
		color=c;
		radius=r;
	}
	//////////////////////////////////CONSTRUCTOR 4
	public String getColor()
	{
	
		return color;
	}
	///////////////////////////////////////METHOD 1
	public double getRadius()
	{
	  return radius;	
	}
	/////////////////////////////////////// METHOD 2
	public double getArea()
	{
		return radius*radius*Math.PI;
	}
	///////////////////////////////////////////// METHOD 3
	public double circumFerance()
	{
		return 2*Math.PI*radius;
	}
	
	public void setRadius(double radius)
	{
		 this.radius=radius;
	}
	
	public void setColor(String color)
	{
		 this.color=color;
	}
	
	// Return a description of this instance in the form of
	// Circle[radius=r,color=c]
	public String toString() {
	   return "Circle have [Radius=" + radius + " Color=" + color + "]";
}
}



