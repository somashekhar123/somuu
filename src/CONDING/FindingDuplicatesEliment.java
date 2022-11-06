package CONDING;

public class FindingDuplicatesEliment {
	public static void main(String[] args) {
		
		String[] s= {"somu","somu","mallu" ,"santu"};
		
		for(int i=0;i<s.length;i++)
		{
		
			for(int j=i+1;j<s.length;j++)
			{
				
				if(s[i]==s[j]) 
				{
					System.out.println("found duplicates element="+s[i]);
				}
			}
		}
		
	}

}
