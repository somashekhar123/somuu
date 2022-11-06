              package CONDING;

public class FindDigitSpecialCarecterAlph {
	
	public static void main(String[] args) {
	String s="somu22@gmail.com";
int alpacount=0;
int digitcount=0;
int scount=0;
	for(int i=0;i<s.length();i++)
	{
	if((s.charAt(i)>='a'&& s.charAt(i)<='z')||(s.charAt(i)>='a'&& s.charAt(i)<='z'))
	{
		alpacount++;
	}
	else if(s.charAt(i)>=0 && s.charAt(i)<=9)
	{
		digitcount++;
	}
	else
	{
		digitcount++;
	}
	
	
	
	
	}	
	System.out.println(alpacount);
	System.out.println(digitcount);
	System.out.println(digitcount);
		
	}

}
