package Day6;

class Pets
{
	void m1()
	{
		System.out.println(" My Pets ");
	}
}
class Dog extends Pets
{
	void m2()
	{
		System.out.println(" My dog name is Bruno ");
	}
}
class Cat extends Dog
{
	void m3()
	{
		System.out.println(" My cat name is pushyyy ");
	}
}
public class Demo 
{

	public static void main(String[] args)
	{
		Pets obj=new Pets();
		obj.m1();
		
		Dog obj1=new Dog();
		obj1.m2();
		
		Cat obj2=new Cat();
		obj2.m3();
		

	}

}
