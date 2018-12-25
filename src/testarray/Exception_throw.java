package testarray;

import java.util.Scanner;

public class Exception_throw {
	static int a,b; 
	public static void main(String[] args) {
		System.out.println("enter two number ");
		Scanner sc = new Scanner(System.in);
		 a = sc.nextInt();
		 b = sc.nextInt();
		
		System.out.println("1");
		System.out.println("2");
		new Exception_throw().fun_one();
		System.out.println("3");
		System.out.println("4");
	}
  void fun_one()
{
	System.out.println("5");
	System.out.println("6");
	new Exception_throw().fun_two();
	System.out.println("7");
	System.out.println("8");
}
 void fun_two()
{
	System.out.println("9");
	System.out.println("10");
	new Exception_throw().fun_three(a,b);
	try
	{
	new Exception_throw().fun_three(a,b);//function three is calling here and exception is also handle here
	}
	
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	System.out.println("11");
	System.out.println("12");
}

  void fun_three(int a,int b) throws ArithmeticException // "throws ArithmeticException" statement tells other class that my function 
                                                          // have some exception that i did not handle at my end
{
	System.out.println("13");
	System.out.println("14");
	
	int c; 
	c= a/b;
	
	System.out.println("15");
	System.out.println("16");
}


}
