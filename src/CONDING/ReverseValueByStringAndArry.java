package CONDING;

public class ReverseValueByStringAndArry {
	
	public static void main(String[] args) {
		
	/*1 approch	//using Array
		int[] x= {2,45,67,7};
		for(int i=x.length-1;i>=0;i--)
		{
			System.out.println(x[i]);
		}*/
	
	
	// 2 approch by using String
  

	String s="Develophar";
	 for(int i=s.length()-1;i>=0;i--)
	 {
		 System.out.print(s.charAt(i)); 
	 }
}
} 