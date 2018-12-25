package testarray;

import java.util.Scanner;

public class array_sorting_one {

	
	public static void main(String args[]) {
		System.out.println("Enter the value of array in 6 number");
		Scanner sc= new Scanner(System.in);
		int ar_one[] = new int[6];
		int i;
		
		
		for(i=0;i<6;i++)
		{
			ar_one[i]= sc.nextInt();
		}
		for(i=0;i<6;i++)
		{
			System.out.println( ar_one[i]);	
		}
		
		System.out.println("Enter the value of array in 6 number");
		
		int ar_two[] = new int[6];
				
		for(i=0;i<6;i++)
		{
			ar_two[i]= sc.nextInt();
		}
		for(i=0;i<6;i++)
		{
			System.out.println( ar_two[i]);	
	
		}
		 add_ar add1 = new add_ar();
		 int sum[] = new int[6];
		  sum = add1.addtion(ar_one,ar_two);
		  System.out.println("Addition of two array");
		  for(i=0;i<6;i++)
		  {
			  System.out.println(sum[i]);
		  }
		 
	}
	
			 
}
class add_ar
{
	
	int[] addtion (int ar_one[], int ar_two[])
	{
		int add[] = new int[6];
		int i ;
		for (i=0;i<6;i++)
		{
		add[i] =  ar_one[i] +  ar_two[i];
		
	
		}
		return add;
		}
	}
