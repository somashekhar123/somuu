package CONDING;

public class SumGivenNumber {
	public static void main(String[] args) {
		int x=1234567;
		int sum=0;
		while(x>0)
		{
			sum=sum+x%10;//7+6+5+4+3+2+1
			x=x/10;//eliminate last digit//123456,12345,1234,123,12,1,0 condition false
		}
		System.out.println("total sum is:"+sum);
	}

}
