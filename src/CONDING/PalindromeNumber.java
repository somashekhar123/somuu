package CONDING;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		
		System.out.println("Enter any number");
		   int num = sc.nextInt();
		    int x=num;
		   int rev=0;
		   while(num!=0)
		   {
			   rev=rev*10+num%10;//0*10+121%10=1, 1*10+12%10=10+2=12,12*10+1%10=120+1=121 its take only last number
			   num=num/10;// eliminates last number 12,1
			   
	       }
          if(x==rev)
          {
        	  System.out.println("palidrome number");
        	  
        	  
          }
          else
          {
        	  System.out.println("not a palindrome number");
          }
	     
	
	}//121,131,1234321
	

}
