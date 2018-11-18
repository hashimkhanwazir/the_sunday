
public class Account {
	
	
	private int id;
	private String name;
	private int balance=0;
	
	Account()
	{}
	
 Account(int id, String name)
 {
 this.id=id;
 this.name=name;
 }
 
 Account(int id, String name,int balance)
 {this.id=id;
 this.name=name;
 this.balance=balance;
 }

 public int getID()
 {return this.id;}
 
 public String getName()
 {return this.name;}
 
 public int getbalance()
 {return this.balance;}
 
 ///////////////////////////////////////////////////////
 
 public int credit(int amount)
 {
	 balance=balance+amount;
	 return balance;
 }
 
 ////////////////////////////////////////////////////////
 
 public int debit(int amount)
 {
	 if (amount<=this.balance)
	 	 balance=this.balance-amount;
	 else 
		 System.out.println("Amount exceeds the balance "); 
	 return balance;
 }	 
 
 /////////////////////////////////////////////////////////////

 public int transferTo(Account firstAccount,int amount)
 {
   if (amount<=this.balance)
   this.balance=this.balance+amount;
   else 
	System.out.println("Amount exceeded balance ");
   return this.balance;
 }
 
 ///////////////////////////////////////////////////////////////
 
 public String toString()
 {
  return "AccountID: "+this.id+" named "+this.name+" have "+this.balance+" in it";
	 
 }
 }
 
 
 