package testarray;

import java.util.Scanner;

public class inner_class {
	 int a, b;
	public static void main(String[] args) {
		
		
		System.out.println("enter the value of a and b");
		Scanner sc = new Scanner(System.in);
		inner_class ic =new inner_class();
		
		ic.a = sc.nextInt();
		ic.b = sc.nextInt();
	//	add a = new add();
	//	int e =a.plus(a,b);
		cal c= new cal();
		int e =c.sub(ic.a, ic.b);
		System.out.println(e);
		int w =add.plus(a,b);
		
		
		

	}
  class add{
		int p;
		int plus() {
			p = a+b;	
			return p;
		}
		
		
}
	public static class cal{
		int s;
		static int sub(int a,int b)
		{
			s= a-b;
			return s;
		}
		
		
		
	}

}
class other
{
	inner_class.cal icc = new inner_class.cal();
	icc.sub
}
