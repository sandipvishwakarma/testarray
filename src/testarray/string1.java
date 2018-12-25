package testarray;

import java.util.Scanner;

public class string1 {
	public static void main(String[] agr) {
		
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String rev = sc.next();
		StringBuilder sb = new StringBuilder(rev);
		
		System.out.println(sb.reverse());
		
	}

}
