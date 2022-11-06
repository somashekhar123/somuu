package CONDING;

public class CountNumber {
	
	public static void main(String[] args) {
		int x=12345;
		int count=0;
		while(x>0)
		{
			x=x/10;
			count++;
		}
		System.out.println("number="+count);
		
		
		/*int[] x= {2,3,4,5,6};
		System.out.println(x.length);*/
		
	}
	

}
