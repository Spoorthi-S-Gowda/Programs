package Day3;

//Run-time polymorphism
class Animal {
	   public void move() {
	      System.out.println("Animals can move");
	   }
	}
	class Dog extends Animal {
	   public void move() {
	      System.out.println("Dogs can walk and run");
	   }
	}
public class MethodOverriding {

	public static void main(String[] args) 
	{
		//calling the move method by the reference variable of the parent class.
		//the method is invoked by the JVM, not the compiler.
		Animal a = new Dog(); // Animal reference and object, Animal reference but Dog object
	      a.move(); // runs the method in Animal class
	       

	}

}
