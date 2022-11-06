package CONDING;

public class CovntEvenandOddNumber {
	public static void main(String[] args) {
		  
		int num=123456;
		int odd_count=0;  
		int even_count=0;
		while(num>0)
		{
          int rem=num%10;//if div 10 give remender  extract of last digit 6,5,4,3
          if(rem%2==0)
          {
        	  even_count++;
          }
          else
          {
        	  
        	  odd_count++;
          }
          num=num/10;//eliminate or         last digit 6
	}
	System.out.println("number of evan number:"+even_count);
	System.out.println("number of odd number:"+odd_count);
}
}