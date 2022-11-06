package CONDING;

public class SplitAndTrimCount {
	public static void main(String[] args) {
		String str ="  java hibernate servlet jdbc ";
		     String[] s = str.trim().split(" ");
		     System.out.println(s.length);
		
		 for(String x:s)
		 {
			 	System.out.println(x); 
		 }
	
}
}