package Day2;
/* Overloading -
 * creating a method with the same name with different parameters.
 */

public class Overloading
{
	//this method will create-number of parameters are and datatype parameters are float
	void cArea(float a)
	{
		//and multiplying this numbers
		System.out.println("Area of seqaure "+a*a+"sq unit");
		
	}
	//number of parameters is two and datatype is float
	void cArea(float a,float b)
	{
		System.out.println("Area of seqaure "+a*b+"sq unit");
	}
	//number of parameters is one and datatype is double
	void cArea(double ra)
	{
		double ar=3.142*ra*ra;
		System.out.println("Area of seqaure "+ar+"sq unit");
	}

	public static void main(String[] args) 
	{
		Overloading a1=new Overloading(); //creating object
		a1.cArea(8.5); //here passing 1 parameter
		a1.cArea(4, 6); //here passing 2 parameter
		a1.cArea(5.5); //here passing 1 parameter

	}

}