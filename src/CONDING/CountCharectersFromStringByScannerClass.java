package CONDING;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountCharectersFromStringByScannerClass {
	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Name");
		        String s=sc.next();
		        
		        Pattern p = Pattern.compile("[\\d]");
		      Matcher m = p.matcher(s);
		       while(m.find())           
		       {
		    	   
		    	   count++;
		       }
		        if(count!=0)
		        {
		        	System.out.println("count is="+count);
		        }
		        else
		        {
		        	System.out.println("count is" +count);
		        }
	}

}
