package CONDING;

public class findAverageNumber {
	public static void main(String[] args) {
		int[] i= {2,4,};
		int sum=0;
		for(int x=0;x<i.length;x++)
		{
			sum=sum+i[x];
		
		}
		System.out.println(sum);
	  float average=sum/i.length;
	  System.out.println(average);
	}

}
