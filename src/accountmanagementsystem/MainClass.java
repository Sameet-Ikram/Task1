
package accountmanagementsystem;
import java.util.*;
//import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		//MENU
		int flag=5;
		SavingAccount SA=new SavingAccount();
		CheckingAccount CA=new CheckingAccount();
		Scanner sc= new Scanner(System.in);
		while(flag!=0)
		{
		
			System.out.println("Please select the service that you want to get:");
			System.out.println("1. Open an account");
			System.out.println("2. Close an account");
			System.out.println("3. Log in to an account");
			//AccountClass AC=new AccountClass();
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Hi! Thank You for choosing our Bank.Please specify the type of account that you want to open:");
				System.out.println("1. Saving Account");
				System.out.println("2. Checking Account");
				int type=sc.nextInt();
				if(type==1)
				{
					System.out.println("Please Enter your Pin code");
					int pin=sc.nextInt();
					if(SA.check(pin)==1) {
						System.out.println("A user can have only one saving account");
						
					}
					else if(SA.check(pin)==0){
						sc.nextLine();
						System.out.println("Please Enter your name:");
						String name=sc.nextLine();
						System.out.println("Please Enter your phone no:");
						int phone=sc.nextInt();
						sc.nextLine();
						System.out.println("Please Enter your address:");
						String address=sc.nextLine();
						SA.Add(pin,name,phone,address);
						
						
					}
				}	
				else if(type==2) {
					
					System.out.println("Please Enter your Pin code");
					int pin=sc.nextInt();
					if(CA.check(pin)==1) {
						System.out.println("A user can have only one checking account");
						
					}
					else if(CA.check(pin)==0){
						sc.nextLine();
						System.out.println("Please Enter your name:");
						String name=sc.nextLine();
						System.out.println("Please Enter your phone no:");
						int phone=sc.nextInt();
						sc.nextLine();
						System.out.println("Please Enter your address:");
						String address=sc.nextLine();
						CA.Add(pin,name,phone,address);
						
						
					}
				
				}	
			}
			
			else if(choice==2) {
			
				System.out.println("Please enter your unique pin number of the account you want to close.");
				int pin=sc.nextInt();
				System.out.println("Please specify the account type you want to close");
				System.out.println("1. Savings");
				System.out.println("2. Checkings");
				int opt=sc.nextInt();
				if(opt==1) {
					
					if(SA.check(pin)==1) {
						
						SA.remove(pin);
					}
					else if(SA.check(pin)==0) {
						
						System.out.println("You have entered wrong pin. Their is no such saving account with this pin");
					}
				}
				else if(opt==2) {
					if(CA.check(pin)==1) {	
						CA.remove(pin);
					}
					else if(CA.check(pin)==0) {
						
						System.out.println("You have entered wrong pin. Their is no such checking account with this pin");
					}
					
				}
				else {
					
					System.out.println("Sorry wrong option selected");
					
				}
			
			}
			else if(choice==3) {
			//First i need to take pin from the user
				// then i will ask if its a saving account or a checking account then i will tell if i can open account or not
				//after that i will perform remaining ftns that are needed to be perform
				System.out.println("You have entered 3");	
			
			}
			else {
			
				System.out.println("Sorry!!! Wrong input");	
			
			}

			System.out.println("Press any key to continue...Enter 0 if you want to quit");
			flag=sc.nextInt();
		}
		SA.display();

	}
}
