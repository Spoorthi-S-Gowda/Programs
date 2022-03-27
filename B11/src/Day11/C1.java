package Day11;

abstract class A1
{
	static int c;
	final int i=10;
	private int d;
	
	public int getD()
	{
		return d;
	}
	public void setD(int d)
	{
		this.d = d;
	}
	void a1()
	{
		System.out.println("Hello");
	}
}
class B1 extends A1
{
	void a2()
	{
		System.out.println("Hi");
		
	}
}

public class C1 
{

	public static void main(String[] args)
	{
		B1 obj=new B1();
		obj.a1();
		obj.a2();
		obj.setD(11);
		System.out.println(obj.getD());

	}

}
