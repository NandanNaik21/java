package interv_Qustion;

import java.util.Scanner;

public class A26Lowercase {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner scan=new Scanner(System.in);
		String str =scan.nextLine();
		lower(str);

	}
	public static void lower(String str) {
		String Lower="";
		char[] ch=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if((ch[i]>=65)&&(ch[i]<=90)) {
				Lower=Lower+(char)(ch[i]+32);
			}
			else {
				Lower=Lower+ch[i];
			}
		}
		System.out.println(Lower);
	}
}