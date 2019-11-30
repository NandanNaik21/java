package interv_Qustion;

import java.util.Scanner;

public class A4factRECURR {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=fact(a);
		System.out.println(b);
	}
	public static int fact(int a) {
		if((a==0)||(a==1)) {
			return 1;
		}
		else {
			return a*(fact(a-1));
		}
	}
}
