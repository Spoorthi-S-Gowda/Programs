package Day6;

class Addition
{
	int sum=0;
	public int addTwoInt(int a,int b)
	{
		sum=a+b;
		
	return sum;
}
}

public class Demo1 {

	public static void main(String[] args) {
		//Creating object of class inside main() method
		Addition a= new Addition();
		
		//Calling method of above class to add two integer using instance created
		int s=a.addTwoInt(10, 20);
		
		 // Printing the sum of two numbers
		System.out.println(" Sum of two integer: "+s);

	}

}
