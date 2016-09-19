/*
 * A Test Driver for the Account class.
 */
public class TestAccount{
	
	public static void main(String[] args){
	Account a1 = new Account(1579);
	System.out.print(a1);

	a1.setBalance(100);
	System.out.println(a1);
	a1.debit(20.5);
	System.out.print("Debit Applied\n"+a1);
	a1.credit(100);
	System.out.println("Credit Applied\n"+a1);

	System.out.print("ERROR HANDLING\n");
	a1.debit(500);


	}

}