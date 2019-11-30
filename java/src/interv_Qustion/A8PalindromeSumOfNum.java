package interv_Qustion;

import java.util.Scanner;

public class A8PalindromeSumOfNum {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=palindrome(a);
		System.out.print("sum of the given number is "+b);
}
	public static int palindrome(int num) {
		int res=0;
		while(num>0) {
			int rem=num%10;
			res=res+rem;
			num=num/10;
		}
		return res;
	}
}
