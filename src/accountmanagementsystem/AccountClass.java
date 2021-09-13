package accountmanagementsystem;

import java.util.LinkedList;

public class AccountClass {
	LinkedList<Integer> pin=new LinkedList<Integer>();
	LinkedList<String> name=new LinkedList<String>();
	LinkedList<Integer> phone=new LinkedList<Integer>();
	LinkedList<String> address=new LinkedList<String>();
	public void Add(int a, String b, int c, String d)
	{
		pin.add(a);
		name.add(b);
		phone.add(c);
		address.add(d);
		
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
	
}
}
