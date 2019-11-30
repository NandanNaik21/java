package interv_Qustion;

import java.util.Scanner;

public class A11CountOfGvnChar {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter a character");
		char ch = sc.next(".").charAt(0);
		Checking(str,ch);

	}
	public static void Checking(String str, char ch) {
		char[] ch1 = str.toCharArray();
		int count=0;
		for(int i=0;i<=ch1.length-1;i++) {
			if(ch1[i]==ch){
				count++;
			}
		}
		System.out.println(count);
	}
}