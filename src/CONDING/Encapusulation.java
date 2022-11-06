package CONDING;

public class Encapusulation {

	private int balance;

	public int getBalance()
	{
		return balance;
	}
	public void setBalance(int balance)
	{
		if(balance>=100)
		{
		this.balance=balance;
		}
		else
		{
			System.out.println("Ammount should be greter than 1000");
		}
	}
	
public static void main(String[] args) {
	Encapusulation e=new Encapusulation();
	e.setBalance(100);
         int x = e.getBalance();
         System.out.println(x);
}
	
}
