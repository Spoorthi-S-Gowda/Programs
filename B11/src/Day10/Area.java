package Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class AreaOfCircleScanner 
{
   public void circle()
    {   
       
      Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the radius:");
         double r= s.nextDouble();
         double  area=(22*r*r)/7 ;
         System.out.println("Area of Circle using Scanner: " + area);      
   }
}
public class Area 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      System.out.print("Please enter radius of circle: ");
	      double radius = Double.parseDouble(br.readLine());
	      double area = Math.PI * radius * radius;
	      System.out.println("Area of circle using bufferedreader: " + area);
	}

}
