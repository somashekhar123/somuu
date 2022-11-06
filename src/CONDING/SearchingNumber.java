   package CONDING;

public class SearchingNumber {
	public static void main(String[] args) {
		int [] x= {1,23,45,5,8};
		int search=45;
		
		for(int i=0;i<x.length;i++)
		{
			if (search==x[i])
			{
				System.out.println("searching eliment is="+x[i]);
				System.out.println("searching eliment position is="+i);
			}
		}
	}


}
