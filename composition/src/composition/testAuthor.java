package composition;

public class testAuthor {
	
	//Author AhTeck = new Author("Ahun Teck","ahuntech@gmail.com",'M');
	
	public static void main(String []args) {
		
		Author AhTeck = new Author("Ahun Teck","ahuntech@gmail.com",'M');
		
	
		System.out.println(AhTeck);
		
		AhTeck.setEmail("engr.hashimwazir@gmail.com");
		
		System.out.println("The Email is "+AhTeck.getEmail());
		System.out.println("The Name is "+AhTeck.getName());
		System.out.println("The Gender is "+AhTeck.getGender());
		
	}
	
	

}
