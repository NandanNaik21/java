package interv_Qustion;

import java.util.Scanner;

public class A23DivisionWthotOperator {

	public static void main(String[] args) {
		System.out.println("Enter  divisior value");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		System.out.println("Enter divident value");
		int num2=s.nextInt();
		division(num1,num2);
	}
	public static void division(int divident, int divisor) {
		int quotient=0;
		while(divident>divisor) {
			divident=divident-divisor;
			quotient++;
		}
		System.out.println("Quotient is "+quotient);
		System.out.println("Reminder is "+divident);	
	}
}
