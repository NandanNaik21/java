package interv_Qustion;

import java.util.Scanner;

public class A21Compare3Num {
	public static void main(String[] args) {
		System.out.println("Enter 1st num");
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		System.out.println("Enter 2nd num");
		int num2=scan.nextInt();
		System.out.println("Enter 3rd num");
		int num3=scan.nextInt();
		Compare(num1,num2,num3);

	}
	public static void Compare(int num1,int num2,int num3) {
		if((num1>num2)&&(num1>num3)) {
			System.out.println("Bigger value is "+num1);
		}
		else if(num2>num3) {
			System.out.println("Bigger value is "+num2);
		}
		else {
			System.out.println("Bigger value is "+num3);
		}
	}
}
