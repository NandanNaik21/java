package interv_Qustion;

import java.util.Scanner;

public class A22LeafYear {

	public static void main(String[] args) {
		System.out.println("Enter the year you want to check");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		leaf(num1);
	}
	private static void leaf(int num1) {
		if(num1%4==0) {
			System.out.println(num1+" is a leaf year" );
		}
		else {
			System.out.println("not leaf year");
		}		
	}
}
