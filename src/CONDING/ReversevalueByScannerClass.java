package CONDING;

import java.util.Scanner;

public class ReversevalueByScannerClass {
	
	public static void main(String[] args) {
		     
		// using scanner input method
		
		Scanner sca= new Scanner(System.in);//recive the user input
		System.out.println("enter the number");
		      int num= sca.nextInt();
		      
		      
// 1 approch      using stringbuffer class
		      
		  /*  StringBuffer bf=new StringBuffer(String.valueOf(num)); 
		           StringBuffer rev = bf.reverse();
		            System.out.println("reverse value from sbuffer: "+rev);*/
		
	//2 approch	  using StringBuilder class
		            
		        StringBuilder sb=new StringBuilder();
		              sb.append(num);
		                  StringBuilder re= sb.reverse();
       System.out.println("reverse by s.builder;  "+re);	
	}

} 
