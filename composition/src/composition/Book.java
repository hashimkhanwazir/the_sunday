package composition;

public class Book {
	
	String name;
	//String author;
	double price;
	int qty=0;
	
	public Book(String name,Author author,double price)
	{}
	
	public Book(String name, Author author, double price, int qty )
	{}
	
	public String getName()
	{return this.name;}
	
	//public String getAuthor()
	//{return this.author;}
	
	public double getPrice()
	{return this.price;}
	
	public void setPrice(double price)
	{this.price=price;}
	
	public int getQty()
	{return this.qty;}
	
	public void setQty(int qty)
	{ this.qty=qty;}
	
	//public String toString()
	//{
		//return "";
	//}
	
	public String toString()
	{
		return"Book NAME ="+this.name+" Price "+this.price+" Quantity: "+this.qty;
		//return" Author[Name="+this.name+"Email="+this.email+"Gender="+this.gender;
	}
}
	

