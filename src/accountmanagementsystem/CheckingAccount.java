package accountmanagementsystem;

public class CheckingAccount extends AccountClass{
	AccountClass AC=new AccountClass();
	double taxx=2.5;
	int transaction_no=0;
	int transaction_fee=10;
	
public void MakeWithdrawel(int x, int value) {
		
		int ind=pin.indexOf(x);
		int amount=balance.get(ind);
		int checking=amount+5000; //since in checking account we can withdraw more than the balance and the limit is 5000.
		if(checking<value)
		{
			System.out.println("Sorry you don't have enough balance");
		}
		else {
			
			amount=amount-value;
			balance.set(ind, amount);
		}
		
	}
public void Tax(int p) {
	
	int ind1=pin.indexOf(p);
	int bal=balance.get(ind1);
	double tax=(bal*(taxx/100));
	System.out.println("The Tax on your account is: "+tax);
	
	
	
	
}
}
