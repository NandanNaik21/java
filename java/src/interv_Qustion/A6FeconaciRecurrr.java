package interv_Qustion;

import java.util.Scanner;

public class A6FeconaciRecurrr {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println(febo(a));

	}
	public static int febo(int num) {
		if(num<=1)
			return num;
		else {
			return febo(num-1)+febo(num-2);
	}
	}
}
