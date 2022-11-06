   package CONDING;

public class FindMaximumAndMinimumValuefromArray {
	public static void main(String[] args) {
		int[] i= {23,56,67,12,2};
		int max=i[0];
		int min=i[0];
		for(int x=1;x<i.length;x++)
		{
			if(i[x]>max)
			{ 
				max=i[x];
			}
			
		}
		System.out.println("maximum number number:"+max);
		
		for(int x=1;x<i.length;x++)
		{
			if(i[x]<min)
			{
				min=i[x];
			}
			
		}
		System.out.println("minimum number is:"+min);
	}

}
