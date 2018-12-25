package testarray;

import java.util.Scanner;

public class fun_2_fun {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the bill unit");
			Scanner sc = new Scanner(System.in);
			int u = sc.nextInt();
			fun_2_fun m = new fun_2_fun();
			int a = m.unit_call(u);
			System.out.println(a);
	}
	public int unit_call(int u)
	{
		int t;
		t = u*10;
		int q =tax_cal(t);
		return q;
	}
public int tax_cal(int t)
{
	int r;
	r = (t*110)/100;
	return r;
	
	
}
		}
		


