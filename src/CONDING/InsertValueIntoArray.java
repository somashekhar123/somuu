            package CONDING;
 
public class InsertValueIntoArray {
	 
	public static void main(String[] args) {
		 
	int[] i= {1,2,45,67,8,9,3,34};
	                                                                                                      
	int indexNumber=4;                                            
	int eliment=100;
	
	for(int x=i.length-1;x>=indexNumber;x--)
	{
		
		i[x]=i[x-1];
	}
	i[indexNumber]=eliment;
	for(int y=0;y<i.length;y++)
	{
		System.out.println(i[y]);
	}
	
	
	}

}
