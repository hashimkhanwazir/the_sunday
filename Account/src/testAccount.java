
public class testAccount {

	public static void main(String[] args)
	{
		Account firstAccount=new Account(1234,"Assam Khan Yousafzai");
		System.out.println(firstAccount.toString());
	
		firstAccount.credit(5000);
		System.out.println(firstAccount.toString());
		
		firstAccount.debit(500);
		System.out.println(firstAccount.toString());
		
		firstAccount.transferTo(firstAccount,firstAccount.getbalance());
		System.out.println(firstAccount.toString());
	
		
	}
}
