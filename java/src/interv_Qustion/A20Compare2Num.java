package interv_Qustion;

import java.util.Scanner;

public class A20Compare2Num {

	public static void main(String[] args) {
		System.out.println("Enter 1st num");
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		System.out.println("Enter 2nd num");
		int num2=scan.nextInt();
		Compare(num1,num2);

	}
	public static void Compare(int num1,int num2) {
		if(num1>num2) {
			System.out.println("Bigger value is "+num1);
		}
		else {
			System.out.println("Bigger value is "+num2);
		}
	}

}
