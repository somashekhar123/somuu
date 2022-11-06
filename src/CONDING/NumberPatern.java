package CONDING;

public class NumberPatern {
	
	public static void main(String[] args) {
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i==0&&j==0)
				{
					System.out.print("1");
				}
				else if(i==1&&j==0)
				{
					System.out.print("2");
				}
				else if(i==1&&j==1)
				{
					System.out.print("3");
				}
				
				else if(i==2&&j==0)
				{
					System.out.print("4");
				}
				else if(i==2&&j==1)
				{
					System.out.print("5");
				}
				else if(i==2&&j==2)
				{
					System.out.print("6");
				}
				
			}
			System.out.print("\n");
		}
	}
	

}
