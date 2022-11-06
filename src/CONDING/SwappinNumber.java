  package CONDING;

public class SwappinNumber {
public static void main(String[] args) {
 //using third variable number	
	int a=10;
	int b=30;
	// swapping means interchanging two elemeants  
	System.out.println("before swapping: "+a+" "+b);
	
	 int t=a;
	     a=b;
	     b=t;
	System.out.println("After swapping by third variables: "+a+" "+b );
	
	// using operate (+ and -)
	 
	/*a=a+b;//10+30=40
	b=a-b;//40-30=10
	a=a-b;//40-10=30
	System.out.println("after swapping using plus and minus sign:"+a+ "  "+b);*/
	
	//using(* and /)swapping 
	
	/*a=a*b;//10*30=300
	b=a/b;//300/30=10
	a=a/b;//300/10
	
	System.out.println("after swapping by multifly and divisible: "+a+" "+b);*/
	
	//BY USING SINGALE STATEMENT 
	
	b=a+b-(a=b);/*b value 30 assing into a its becomes 30 than a+b 40 result b=40-30=10 similarly next round 
	10 assing into a becomes a=10  b=40-10=30 traversing from right to left */ 
	 
	//System.out.println("swapping by singale statement :"+a+" "+b );
} 


}
                