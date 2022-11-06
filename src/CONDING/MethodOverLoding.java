package CONDING;


class Voicecall
{
	}
class ConferenceCall
{
	}
class videocall
{
	}
public class MethodOverLoding {
	
	public void call(Voicecall v)
	{
		System.out.println("suport for voicecall");
	}
	public void call(ConferenceCall c)
	{
		System.out.println("suport for conferencecall");
	}
	public void call(videocall vi)
	{
		System.out.println("suport for videocall");
	}
	public static void main(String[] args) {
		
	
	
	MethodOverLoding m= new MethodOverLoding();
	m.call(new Voicecall());
	m.call(new ConferenceCall());
	m.call(new videocall());
	
	}
	
}
