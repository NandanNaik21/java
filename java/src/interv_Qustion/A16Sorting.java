package interv_Qustion;

import java.util.Scanner;

public class A16Sorting {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Array Size");
		int []arr=new int[scan.nextInt()];
		int[] arr1 = addElements(arr);
		System.out.println("Bofore sorting");
		print(arr1);
		int[] arr2 = sort(arr1);
		System.out.println("After sorting");
		print(arr2);
	}
	public static int[] addElements(int []arr) {
		System.out.println("Enter the the elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		return arr;
	}
	public static void print(int []arr1) {
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.print(arr1[i]+",");
		}
		System.out.println();
	}
	public static int[] sort(int []arr1) {
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=i+1;j<=arr1.length-1;j++) {
				if(arr1[i]>arr1[j]) {
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		return arr1;
	}
}
