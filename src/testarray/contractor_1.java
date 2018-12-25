package testarray;

import java.util.Scanner;

public class contractor_1 {

	public static void main(String[] args) {
		System.out.println("Enter the value of A and B");
		System.out.println("Enter the value of q and e");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		float q = sc.nextFloat();
		float e = sc.nextFloat();
		Addition ad = new Addition(a,b);//constructor calling 
		Addition sub = new Addition(q,e);
		System.out.println(ad.w);
		System.out.println(sub.s);
		

	}
}
	class Addition
	{
		 int w ;
		 float s;
		 Addition(int a,int b)//constructor creation
		{
		
		 w = a +b;
		 
		}
		Addition(float q, float e)
		{
			s= q-e;
		}
	}


