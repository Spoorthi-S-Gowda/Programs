
// Default Modifier
package Day10_Default2;
import Day10_Default1.*;

// This class is having default access modifier
public class B1
{
	public static void main(String args[]) 
    { 
        // Accessing class A1 from package p1 
        A1 obj = new A1(); 
  
        obj.display(); //error while using class from different package
    } 

}
