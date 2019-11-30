package interv_Qustion;

import java.util.Scanner;

public class A12StringPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine(); 
		String str1=pali(str);
		if(str.equals(str1)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("Not pali");
		}

	}
	public static String pali(String str) {
		String res="";
		char[] ch=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			res= ch[i]+res;	
		}
		System.out.println("reverse of given STring "+res);
		return res;
	}
}
