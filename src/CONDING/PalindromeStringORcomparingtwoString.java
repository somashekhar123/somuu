package CONDING;

import java.util.Scanner;

public class PalindromeStringORcomparingtwoString {
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any String");
	        String st = sc.next();
	        String s=st;
	        String rev="";
	       for(int i=st.length()-1;i>=0;i--)
	       {
	    	   
	    	   rev=rev+st.charAt(i);
	    	   
	    	   }
	if(s.equals(rev))
	{
		System.out.println("Given String is palindrome ");
	}
	else
	{
		System.out.println("given string is not palindrome");
		
	}
	}
	

}
