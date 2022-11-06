 package CONDING;

public class NameVowels {
	
	public static void main(String[] args) {
		String j="praveen";
		for(int i=0;i<j.length()-1;i++)
		{
		if(j.charAt(i)=='a'||j.charAt(i)=='e'||j.charAt(i)=='i'||j.charAt(i)=='o'||j.charAt(i)=='u')
		{
			System.out.println("The vowels:"+j.charAt(i));
		}
		else
		{
			System.out.println("The consonents="+j.charAt(i));
		}
		}
	}

}
