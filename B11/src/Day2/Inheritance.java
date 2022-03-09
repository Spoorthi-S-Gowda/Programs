package Day2;
/* Inhertiance-
 * In inheritance,one class inherits the properties of another.
   It enables a child class to inherit the properties 
   and behavior from a parent class.
 */

class Rectangle //Parent class
{
	int length; // here i defining variable called int length
	int breadth; // here i defining variable called int breadth
	int area;
	void findArea() //created method called findArea
	{
		area=length*breadth;
	}
}
/* class RectangleDimension child class which inherits the properties
 and behavior so we use extends*/
class RectangleDimension extends Rectangle //Child class
{
	
	void display() // i created method called display and this method just print the value of area
	{
		System.out.println("Area of Rectangle is: "+area);
	}
}
public class Inheritance {

	public static void main(String[] args) 
	{
		/*if i created object for class rectangle 
          through that object i can access only variables and method
             because the object referring to Rectangle.*/
		/*Rectangle r=new Rectangle();
		r.length=50;
		r.breadth=20;
		r.findArea();*/ //similarly i can also access the method
		
		/*and i created object for class rectangledimension
          by using object of i can access parent class and child class
          once we created object for child class we can access everthing from parent class
           and also child class*/
		RectangleDimension rd=new RectangleDimension(); //created object
		rd.length=50;
		rd.breadth=20;
		rd.findArea();
		rd.display();
		

	}

}
