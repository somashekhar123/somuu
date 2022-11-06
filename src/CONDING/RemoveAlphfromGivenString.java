    package CONDING;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveAlphfromGivenString {
	
	
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[A-Z]");
		    Matcher m = p.matcher("12@agw^%9877AD");
		    while(m.find())
		    {
		    	System.out.println(m.start()+""+m.group());
		    }
	}

	 
}
 