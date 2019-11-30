package interv_Qustion;

import java.util.Scanner;

public class A13StringPaliRecurrrs {
	static int i=0;
	static String res="";
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=pali(str);
		System.out.println("Reverse of given string is "+str1);
		if(str.equals(str1)) {
			System.out.println("pali");
		}
		else {
			System.out.println("not pali");
		}
	}
	public static String pali(String str) {
		if(i<str.length()) {
			res=str.charAt(i)+res;
			i++;
			pali(str);}
		return res;
	}	
}


