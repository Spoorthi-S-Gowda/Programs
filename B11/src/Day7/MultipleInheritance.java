package Day7;

class A
{  
	void msg()
	{
		System.out.println("Hello");
	}  
}  
class B
{  
	void msg()
	{
		System.out.println("Welcome");
	}  
}  
//Multiple Inheritance occurs when one class extends more than one other class. 
//For example, Class C extends Classes A and B.
//This is referred to as multiple Inheritance.
//Multiple Inheritance is not allowed in Java
class C extends A,B //Compilation error is thrown

void msg()
{
	System.out.println("Spoorthi");
}


public class MultipleInheritance 
	{
 public static void main(String args[])
 {  
   C obj=new C();  
   obj.msg(); 
}  
}  



