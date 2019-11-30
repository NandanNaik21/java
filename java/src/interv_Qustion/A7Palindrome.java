package interv_Qustion;

import java.util.Scanner;

public class A7Palindrome {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=palindrome(a);
		System.out.print("reverce of given number is "+b);
		if(a==b) {
			System.out.println("palindrome");
		}
		else {
			System.out.print(" and it is not palindrome");
		}

	}
	public static int palindrome(int a) {
		int res=0;
		while(a>0) {
			int rem=a%10;
			res=res*10+rem;
			a=a/10;
		}
		return res;
	}
}
