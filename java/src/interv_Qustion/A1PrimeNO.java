package interv_Qustion;

import java.util.Scanner;

public class A1PrimeNO {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		prime(a);
	}
	public static void prime(int a) {
		boolean flag=false;
		for(int i=2;i<a;i++)
			if(a%i==0) {
				flag=true;
				break;
			}
		if((flag==true) &&(a>1)){
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
	}
}
