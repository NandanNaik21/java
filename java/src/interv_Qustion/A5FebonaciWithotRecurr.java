package interv_Qustion;

import java.util.Scanner;

public class A5FebonaciWithotRecurr {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		febo(num);

	}
	public static void febo(int num) {
		int a=0, b=1, c=0;
		System.out.print(a+","+b);
		for(int i=1;i<=num;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(","+c);
		}
	}
}