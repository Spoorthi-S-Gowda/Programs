
//Private Modifier
package Day10_Privatee1;

class D
{
	private void display() 
    { 
        System.out.println(" Private Modifier "); 
    } 
} 
  
class C 
{ 
public static void main(String args[]) 
    { 
        D obj = new D(); 
        // Trying to access private method
        // of another class 
        obj.display(); 
    } 

}
