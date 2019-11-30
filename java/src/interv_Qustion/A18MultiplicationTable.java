package interv_Qustion;

import java.util.Scanner;

public class A18MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Which muliply table u want?");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		multplication(num);

	}
	public static void multplication(int num) {
		int res=1;
		for(int i=1;i<=10;i++) {
			System.out.println((res=num*i));
		}
	}
}
