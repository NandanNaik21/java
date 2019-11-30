package interv_Qustion;

import java.util.Scanner;

public class A25UpperCase {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner scan=new Scanner(System.in);
		String str =scan.nextLine();
		upper(str);

	}
	public static void upper(String str) {
		String Upper="";
		char[] ch = str.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if((ch[i]>=97)&&(ch[i]<=122)){
				Upper=Upper+(char)(ch[i]-32);
			}
			else {
				Upper=Upper+ch[i];
			}
		}
		System.out.println(Upper);
	}
}
