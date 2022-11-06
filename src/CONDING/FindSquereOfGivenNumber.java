package CONDING;

import java.util.Scanner;

public class FindSquereOfGivenNumber {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter any number");
		   int n = s.nextInt();
		   
		   if(n>0)
		   {
			   n=n*n*n;
		   }
		   System.out.println(n);
	}

}
