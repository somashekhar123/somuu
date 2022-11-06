package CONDING;

public class FindMissingNumber {
	public static void main(String[] args) {
		
	  	int[] i = {1,4,3,5,6,7,8};
		int sum2=0;
		int sum1=0;
		for(int x=0;x<i.length-1;x++)
		{
			
			sum1=sum1+i[x];
		}
		System.out.println(sum1);
		
		for(int x=1;x<8;x++)
		{
			sum2=sum2+x;
		}
		System.out.println(sum2);
		System.out.println("missing number="+(sum2-sum1));
	}


}
