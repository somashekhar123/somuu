    package CONDING;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GiveOnlySpecialCharecterFr0mString {
	
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a]");
		 Matcher m = p.matcher("aabbabbsas");
		   while(m.find())
				   {
			   
			   System.out.println(m.start()+""+m.group());
				   }
		             
		
		
	}

}
