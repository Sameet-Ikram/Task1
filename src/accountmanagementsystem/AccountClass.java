package accountmanagementsystem;

import java.util.LinkedList;
import java.text.SimpleDateFormat;  
import java.util.Date;
public class AccountClass {
	LinkedList<Integer> pin=new LinkedList<Integer>();
	LinkedList<String> name=new LinkedList<String>();
	LinkedList<Integer> phone=new LinkedList<Integer>();
	LinkedList<String> address=new LinkedList<String>();
	LinkedList<Integer> accountno=new LinkedList<Integer>();
	LinkedList<String> date=new LinkedList<String>();
	LinkedList<Integer> balance=new LinkedList<Integer>();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	int transaction;
	static int AccNo=11111;
	
	public void Add(int a, String b, int c, String d, int g)
	{
		Date datee=new Date();
		pin.add(a);
		name.add(b);
		phone.add(c);
		address.add(d);
		accountno.add(AccNo);
		date.add(formatter.format(datee));
		balance.add(g);
		AccNo++;
		
		
	}
	public int check(int x) {
		
			if(pin.indexOf(x)!=-1) {
			
				//int indexx=pin.indexOf(x);
				//System.out.println("Name= "+name.get(indexx));
				//System.out.println("This pin already exists");
				return (1);
			
			}
			else {
				//System.out.println("This pin is invalid");
				return (0);
			}
		}
	public void remove(int x) {
	
		int ind=pin.indexOf(x);
		pin.remove(ind);
		name.remove(ind);
		phone.remove(ind);
		address.remove(ind);
		accountno.remove(ind);
		date.remove(ind);
		balance.remove(ind);
	}
	
	public void checkbalance(int x) {
		int ind=pin.indexOf(x);
		System.out.println("Balance in your account is: "+balance.get(ind));
	}
	
	
	public void MakeDeposit(int x,int value) {
		int ind=pin.indexOf(x);
		int amount=balance.get(ind);
		amount=amount+value;
		balance.set(ind, amount);
		transaction=value;
	}
	public void PrintStatement(int x) {
		int ind=pin.indexOf(x);
		System.out.println("Name: "+name.get(ind));
		System.out.println("Phone No: "+phone.get(ind));
		System.out.println("Address: "+address.get(ind));
		System.out.println("Account No: "+accountno.get(ind));
		System.out.println("Transaction date: "+date);
		System.out.println("Transaction amount: "+transaction);
		System.out.println("Remaining balance: "+balance.get(ind));
	}
	
	public void Transfer(int pin1,int acc, int amountt) {
		
		if(accountno.indexOf(acc)!=-1) {
			int ind1=pin.indexOf(pin1);
			int ind2=accountno.indexOf(acc);
			int balancee=balance.get(ind1);//gets balance of account 1
			if(amountt>balancee)
			{
				
				System.out.println("Sorry you don't have enough balance to transfer amount");
			}
			else
			{
				balancee=balancee-amountt;
				balance.set(ind1, balancee);
				int balance2=balance.get(ind2);
				balance2=balance2+amountt;
				balance.set(ind2, balance2);
				
			}
		
		}
		else {
			
			System.out.println("Sorry the account you want to transfer money doesn't exist.");
		}
		
		
		
	}
	
	

}
