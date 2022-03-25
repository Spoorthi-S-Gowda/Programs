package Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaTester
{
   public static void main(String args[]) throws NumberFormatException, IOException
   {
	// You can make the object InputStreamReader object inside the BufferReader method.
      BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter an number:");
   // You can even inspect the type of the input stream manually by using Parse method which accepts string parameter.
      int a = Integer.parseInt(bufferReader.readLine());
      System.out.printf("You entered: " + a);
      
   // Creating object of Scanner class to
   // read input from keyboard
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("\nEnter an number:");
      
      // Using nextInt() to parse integer values
      a = scanner.nextInt();
      System.out.printf("You entered: " + a);
   }
}