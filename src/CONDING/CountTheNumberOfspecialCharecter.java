package CONDING;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountTheNumberOfspecialCharecter {
	
	public static void main(String[] args) {
		int count=0;
		  Pattern p = Pattern.compile("[\\D]");
		  Matcher m = p.matcher("somu123@gmail.com");
		   while(m.find())  
		   {
			   count++;
			   System.out.println(m.start()+""+m.group());
		   }
		   
		   if(count!=0)
		   {
			   System.out.println("number of countis="+count);
		   }
		   else
		   {
			   System.out.println("there is no count="+count);
		   }
	}

}
