package interv_Qustion;

import java.util.Scanner;

public class A14Swaping2Num {

	public static void main(String[] args) {
		System.out.println("Enter 1st Number");
		Scanner sc=new Scanner(System.in);
		int FirstNum =sc.nextInt();
		System.out.println("Enter 2nd Number");
		int SecondNum=sc.nextInt();
		swap(FirstNum,SecondNum);
	}
public static void swap(int fv, int sv) {
	int temp=fv;
	fv=sv;
	sv=temp;
	System.out.println("1st value is "+fv+" Second value is "+sv);
}
}
