package testarray;

import java.util.Scanner;

public class Grade_1 {

	public static void main(String[] args) {
		System.out.println("enter the marks");
		Scanner sc= new Scanner(System.in);
		int m = sc.nextInt();
		grade(m);
		char mygarde = grade(m);
		System.out.println(mygarde);
		
	}
	public static char grade(int m)
	{
		if (m<=50)
		{
			
			return 'c' ;
		}
		else
		{
			if (m<=75)
			{
				
				return 'b';
				
			}
			else 
			{
				 
				return 'a'; 
			}
		}
	}

}
