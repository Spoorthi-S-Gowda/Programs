package Day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class ScannerTable
{
	public void Multiplication()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number:");        
		int n=s.nextInt();
	        for(int i=1; i <= 10; i++)
	        {
	            System.out.println(n+" * "+i+" = "+n*i);
	        }
		
	}
}

public class MultiplicationTable1
{
    public static void main(String[] args)  throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    	System.out.println(" Multiplication Table ");
        int n =Integer.parseInt(br.readLine());
        
        System.out.println("***Multiplication Table***");
        
        for(int i=1; i<=n; i++)
        {
          System.out.println(n+ " x " +i+ " = " +n*i);
        }
        
    }
}


