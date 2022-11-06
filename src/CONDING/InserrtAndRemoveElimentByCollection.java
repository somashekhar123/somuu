package CONDING;

import java.util.ArrayList;

public class InserrtAndRemoveElimentByCollection {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		
		a.add(12);
	    a.add(34); 
	    a.add(45);
	System.out.println(a);
	   a.add(1,200);
	   System.out.println(a);
	 if(a.contains(34))
	 {
		 System.out.println("value is present");
	 }
	 else
	 {
		 System.out.println("value is nit present");
	 }
	   
	a.remove(2);
	System.out.println(a);
	   
	   
	}

}
