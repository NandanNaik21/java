package interv_Qustion;

import java.util.Scanner;

public class A3FactorialWithotReccurr {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=fact(a);
		System.out.println(b);
	}
	public static int fact(int a) {
		int res=1;
		for(int i=1;i<=a;i++) {
			res=res*i;	
		}
		return res;
	}
}
