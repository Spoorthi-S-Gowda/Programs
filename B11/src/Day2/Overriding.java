package Day2;

/* Overriding-
 * if child class has the same method as declared in the parent class
 * is known as method overriding.
 */
class Circle
{
	int a;
	float area;
	 void a1(int a)
	{
		this.a=a;
	}
	void cArea()
	{
		area=3.14F*a*a;
	}
	void display()
	{
		System.out.println(" Area is " +area);
	}
}
class Triangle extends Circle
{
	int b;
	void b1(int b)
	{
		this.b=b;
	}
	void tArea()
	{
		area=(a*b)/2;
	}
	void cArea()//or override we should not change definition but body we have to change
	{
		area=3.14F*a;
	}
	void display()
	{
		System.out.println(" Area is " +area);
	}
}

public class Overriding {

	public static void main(String[] args) 
	{
		Circle c=new Circle();
		c.a1(10);
		c.cArea();
		c.display();
		Triangle t=new Triangle();
		t.b1(20);
		t.a1(30);
		t.tArea();
		t.cArea();
		t.display();
		c.display();	

	}

}
