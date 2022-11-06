package CONDING;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveWidespaceFromString {
	
	public static void main(String[] args) {
		
		String s="java devoloper in bengalore";
		System.out.println(s);
		
		        String b = s.replaceAll("\\s","");//space is replace by noting
		        System.out.println(b);
		
	}
	
}
	


