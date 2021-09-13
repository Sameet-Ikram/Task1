package accountmanagementsystem;
public class SavingAccount extends AccountClass{
	AccountClass AC=new AccountClass();
	double interest_rate=.20;
	public void MakeWithdrawel(int x, int value) {
		
		int ind=pin.indexOf(x);
		int amount=balance.get(ind);
		if(amount<value)
		{
			System.out.println("Sorry you don't have enough balance");
		}
		else {
			
			amount=amount-value;
			balance.set(ind, amount);
		}
		
	}
	
	public void Zakat(int pinn) {
		int ind1=pin.indexOf(pinn);
		int bal=balance.get(ind1);
		if(bal>20000)
		{
			double zakat=(bal*2.5)/100;
			System.out.println("The zakat on your account is: "+zakat);
		}
		else {
			
			System.out.println("Zakat is not applicable on your account");
		}
	}
	
	public void CalculateInterest(int pinn) {
		
		
		int ind1=pin.indexOf(pinn);
		int bal=balance.get(ind1);
		double interest=(bal*interest_rate);
		System.out.println("The Interest on your account is: "+interest);
		
	}

}
