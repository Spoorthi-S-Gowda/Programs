package Day5;

class Animal2
{  
Animal2()
{
	System.out.println("animal is created");
}  
}  
class Dog2 extends Animal2
{  
Dog2() //super() can be used to invoke immediate parent class constructor.
{  
super();  
System.out.println("dog is created");  
}  
}  
public class SuperKeyword3 
{
	public static void main(String args[])
	{  
		Dog2 d2=new Dog2();  
	}
}
