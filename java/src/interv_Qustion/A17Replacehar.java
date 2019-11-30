package interv_Qustion;

import java.util.Scanner;

public class A17Replacehar {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println("Which charcter u want to replace ");
		char ch1 = scan.next(".").charAt(0);
		System.out.println("Enter new character");
		char ch2 = scan.next(".").charAt(0);
		String str1=Replace(str,ch1,ch2);
		System.out.println("After replacing new string is "+str1);
	}
	public static String Replace(String str,char ch1,char ch2) {
		String res="";
		char[] ch=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]==ch1) {
				res=res+ch2;
			}
			else {
				res=res+ch[i];
			}
		}
		return res;
	}
}
