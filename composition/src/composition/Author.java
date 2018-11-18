package composition;

public class Author {
	
	String name;
	String email;
	char gender;
	
	public Author(String name, String email,char gender)
	{ 
    this.name=name;
	this.email=email;
	this.gender=gender;
	}
	
	public String getName()
	{return name;}
	
	public void setName(String name)
	{this.name=name;}
	
	public String getEmail()
	{ return email;}
	
	public void setEmail(String email)
	{ this.email=email; }
	
	public char getGender()
	{return gender;}
	
	public String toString()
	{
		return" Author Name="+name+" Email= "+email+" Gender= "+gender;
		//return" Author[Name="+this.name+"Email="+this.email+"Gender="+this.gender;
	}

}
