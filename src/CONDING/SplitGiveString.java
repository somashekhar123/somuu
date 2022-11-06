package CONDING;

import java.util.StringTokenizer;

public class SplitGiveString {
	
	public static void main(String[] args) {
		int count=0;
		StringTokenizer s=new StringTokenizer("12-12-2022" , "-");
		while(s.hasMoreTokens())
		{
			System.out.println(s.nextToken());
			count++;
		}
	
	System.out.println(count);
	}

}
