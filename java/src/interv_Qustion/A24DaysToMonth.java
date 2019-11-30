package interv_Qustion;

import java.util.Scanner;

public class A24DaysToMonth {

	public static void main(String[] args) {
		System.out.println("Enter  number of days");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		month(num1);
	}
	public static void month(int days) {
		int month=30;
		int count=0;
		while(days>month) {
			days=days-month;
			count++;
		}
		System.out.println("Number of month is "+count+" & Num of remaining days "+days);
	}
}
