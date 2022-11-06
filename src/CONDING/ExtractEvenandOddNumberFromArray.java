package CONDING;

public class ExtractEvenandOddNumberFromArray {
	public static void main(String[] args) {
		int[] i= {1,2,3,4,5,6,7,8,9};
	
		for(int x=0;x<i.length-1;x++)
		{
			if(i[x]%2==0)
			{
			System.out.println(i[x]);	
			}
		}
		

		for(int x=0;x<i.length-1;x++)
		{
			if(i[x]%2!=0)
			{
				
				System.out.print(i[x]);
			}
				
		}
	}

}
