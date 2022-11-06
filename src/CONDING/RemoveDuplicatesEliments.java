package CONDING;

public class RemoveDuplicatesEliments {
	
	public static void main(String[] args) {
		
		int[] x= {1,1,2,3,4,4,5,5};
		//int[] y=new int[x.length-1];
		for(int z=0;z<x.length-1;z++)
		{
		if(x[z]!=x[z+1])
		{
			
			System.out.println(x[z]);
		}
			
		}
	}
	
	

}
