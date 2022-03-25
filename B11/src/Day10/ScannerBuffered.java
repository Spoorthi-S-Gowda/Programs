package Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class ScannerDemo1
{
	public void M1()
	{

        // Creating object of Scanner class to
        // read input from keyboard
        Scanner scn = new Scanner(System.in);
 
        System.out.println("Enter an integer");
 
        // Using nextInt() to parse integer values
        int a = scn.nextInt();
 
        System.out.println("Enter a String");
 
        // Using nextInt() to parse integer values
        String b = scn.nextLine();
 
        // Display name and age entered above
        System.out.printf("You have entered:- " + a + " "
                          + "and name as " + b);
	}
}
public class ScannerBuffered
{
	public static void main(String[] args)  throws IOException
	{

        // Creating object of class inside main() method
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        System.out.println("Br-Enter an integer");
 
        // Taking integer input
        int a = Integer.parseInt(br.readLine());
 
        System.out.println("Br-Enter a String");
 
        String b = br.readLine();
 
        // Printing input entities above
        System.out.printf("You have entered:- " + a
                          + " and name as " + b);
	}
}