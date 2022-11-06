package CONDING;

public class Mobile extends Overriding {
	@Override
	public void display()
	{
		super.display();
		System.out.println("double click  support");
	}

	@Override
	public void phone()
	{
		super.phone();
		System.out.println("suport for video call");
	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.display();
		m.phone();
	}
}
