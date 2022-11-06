package CONDING;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptSpecialCharectergivereamaingString {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-z 0-9]");
		    Matcher m= p.matcher("somu123@gmail.com");
		    
		    
		    while(m.find())
		    {
		    	
		    	System.out.println(m.start()+""+m.group());
		    }
		    
	}

}
 