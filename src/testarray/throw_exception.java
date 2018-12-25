package testarray;

import java.util.Scanner;

public class throw_exception {
	public static void main(String args[])
	{
		int a;
		System.out.println("Enter the number of a");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		try
		{
		if ( a<1||a>4)
		{
			throw new ArithmeticException();
			
		}
		else
		{
			System.out.println("Number in given range");
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println("PLease enter correct number");
		}
		finally
		{
			System.out.print("good");
		}
	}

}
