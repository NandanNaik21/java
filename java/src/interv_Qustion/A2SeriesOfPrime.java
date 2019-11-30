package interv_Qustion;

import java.util.Scanner;

public class A2SeriesOfPrime {

	public static void main(String[] args) {
		System.out.println("Enter 1st number");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println("enter 2nd number");
		int b=scan.nextInt();
		prime(a,b);
	}
	public static void prime(int a,int b) {
		for(int i=a;i<b;i++) {

			boolean flag=false;
			for(int j=2;j<i;j++)
			{
				if(i%j==0) {
					flag=true;
					break;
				}
			}
			if(flag==true) {
				System.out.println("not prime"+ i);
			}
			else {
				System.out.println("prime"+i);
			}
		}
	}
}
