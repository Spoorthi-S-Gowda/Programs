package Day5;

class Animal
{  
String color="white";  
}  
class Dog extends Animal
{  
String color="black"; ////super can be used to refer immediate parent class instance variable.
void printColor()
{  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}  
public class SuperKeyword1 
{
	public static void main(String args[])
	{  
		Dog d=new Dog();  
		d.printColor();  
	}

}
