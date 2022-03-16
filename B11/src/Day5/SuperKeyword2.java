package Day5;

class Animal1
{  
void eat()
{
	System.out.println("eating...");
}  
}  
class Dog1 extends Animal1
{  
void eat() //
{
	System.out.println("eating bread...");
	
}  
void bark()
{
	System.out.println("barking...");
	
}  
void work() //super can be used to invoke immediate parent class method.
{  
super.eat();  
bark();  
}  
}  
public class SuperKeyword2
{
	public static void main(String args[])
	{  
		Dog1 d1=new Dog1();  
		d1.work();  
	}

}
