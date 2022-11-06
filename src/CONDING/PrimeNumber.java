package CONDING;

public class PrimeNumber {
	public static void main(String[] args) {
		int x=7;
		int count=0;
		for(int y=1; y<=x;y++)
		{
			
			if(x%y==0)
			count++;
		}
    if (count==2)
    {
    	System.out.println("prime number");
    }
    else
    {
    	System.out.println("not a prime number");
    }
	}
	
}
