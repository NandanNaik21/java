package interv_Qustion;

import java.util.Scanner;

public class A19ListOfEvenNum {

	public static void main(String[] args) {
		System.out.println("Enter 1st number");
		Scanner scan=new Scanner(System.in);
		int firstnum = scan.nextInt();
		System.out.println("Enter 2nd number");
		int secondnum=scan.nextInt();
		EvenNum(firstnum,secondnum);

	}
	public static void EvenNum(int fv, int sv) {
		System.out.println("List of even numbers are ");
		for(int i=fv;i<=sv;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
