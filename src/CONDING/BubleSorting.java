        package CONDING;

import java.util.Arrays;

public class BubleSorting {
	public static void main(String[] args) {
		
		int[] x= {2,4,1,3,5,7,3};
		
		for(int i=0;i<x.length-1;i++)
		{
		for(int j=0;j<x.length-1;j++)
		{
			if(x[j]>x[j+1])
			{
				int temp=x[j];
				x[j]=x[j+1];
				x[j+1]=temp;
			}
			
		}
			
		}

System.out.println("sorting:"+Arrays.toString(x));
	
	}
	

}
