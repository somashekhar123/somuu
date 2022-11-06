package CONDING;

public class Factorial {
	public static void main(String[] args) {
		//5!=1*2*3*4*5=120 multiply bellow the factrial numberr
		
		int num=5;
		long factorial =1;
		for(int i=1;i<=num;i++)
		{
			
			factorial=factorial*i;
			
		}
		System.out.println("factrorial number="+factorial);
	}
	
}
