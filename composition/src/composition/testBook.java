package composition;

public class testBook {
	
	public static void main(String []args)
	
	{
		Author AhTeck=new Author("Ahum Teck","ahumteck@gmail.com",'M');
		System.out.println(AhTeck);
		
		Book dummyBook=new Book("Java for Dummy",AhTeck,19.95,99);
		System.out.println(dummyBook);
		
		System.out.println(AhTeck.getName());
		System.out.println(dummyBook.getPrice());
		System.out.println(dummyBook.getQty());
		System.out.println(dummyBook.getName());
		System.out.println(AhTeck.getEmail());
		System.out.println(AhTeck.getGender());
		
		System.out.println(dummyBook);
	}

}
