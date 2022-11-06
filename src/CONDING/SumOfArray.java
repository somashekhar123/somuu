package CONDING;

public class SumOfArray {
	public static void main(String[] args) {
		int[] i= {12,34,45,17};
		int sum=0;
		for(int x=0;x<i.length-1;x++)
		{
			sum=sum+i[x];
			
		}
		System.out.println("total sum:"+sum);
	}

}
