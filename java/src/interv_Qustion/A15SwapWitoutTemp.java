package interv_Qustion;

import java.util.Scanner;

public class A15SwapWitoutTemp {

	public static void main(String[] args) {
		System.out.println("Enter 1st Number");
		Scanner sc=new Scanner(System.in);
		int FirstNum =sc.nextInt();
		System.out.println("Enter 2nd Number");
		int SecondNum=sc.nextInt();
		swap(FirstNum,SecondNum);
	}
	public static void swap(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("1st value is "+a+" Second value is "+b);

	}
	
}
