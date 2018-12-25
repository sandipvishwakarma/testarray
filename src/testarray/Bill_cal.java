package testarray;

import java.util.Scanner;

public class Bill_cal {

	public static void main(String[] args) {
		System.out.println("Enter the bill unit");
		Scanner sc = new Scanner(System.in);
		int u = sc.nextInt();
		Bill_cal bc = new Bill_cal();
	int d = bc.unit_cal(u);
	int e = bc.tax_cal(d);
		
System.out.println(e);

	}
	public int unit_cal(int u)
	{
		int t;
		t= u*10;
		return t;
		
	
	}
	public int tax_cal(int d)
	{
		int r;
		r= (d*110)/100;
		return r;
	}
	}
