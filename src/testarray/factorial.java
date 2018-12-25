package testarray;

import java.util.Scanner;

public class factorial {
 public static void main(String[] args)
 {
	 System.out.println("enter any integer value");
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 fact(a);
	 
	
 }
 static void fact(int a)
 {
	 int i;
	 int f = 1;
	 for (i= 1;i<=a;i++) {
		 
		 f= f*i;
		 
		 
	 }
	 System.out.println(f);
 }
}
