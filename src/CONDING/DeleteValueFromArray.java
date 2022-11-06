package CONDING;

public class DeleteValueFromArray {

	public static void main(String[] args) {
		int[] i = {12,34,4,6,12};
		int y=i[2];
	
		for(int x=0;x<i.length;x++)
		{
			if(y!=i[x])
			{
				System.out.println(i[x]);
			}
			
		}
	
		
	}
}
