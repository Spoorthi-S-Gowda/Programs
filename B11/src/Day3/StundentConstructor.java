package Day3;

class Student
{
	// data members of the class.
	int sid;
	String sname;
	char grade;

// Constructor would initialize data members
// With the values of passed arguments while
// Object of that class created
Student(int id,String name,char g)//constructor
{
	sid=id;
	sname=name;
	grade=g;
}
void display()
{
	System.out.println(sid+" "+sname+" "+grade);
}

}


public class StundentConstructor 
{
	public static void main(String[] args) 
	{
		// This would invoke the parameterized constructor.
		Student stu=new Student(1010,"John",'A');
		stu.display();

	}

}
