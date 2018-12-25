package testarray;

import java.util.Scanner;

public class exception_handle {
	public static void main(String args[]) {
		
		System.out.println("Enter the value of a and b");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b= sc.nextInt();
		int c = 0;
		try {
			c=a/b;
		}
		//catch(Exception e)
		
		catch(NullPointerException e){
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println(c);
		System.out.println("after");
	}

}
