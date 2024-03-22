package com.assignment.second;

import java.util.Scanner;

public class Program2 {
	private  static Scanner sc = new Scanner(System.in);
		public static int[] getArray() {
			int[] arr = new int[3];
			return arr;
			}
		
		
		public static void acceptRecord(int[] arr) {
			System.out.println("Enter the elements: ");
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
		}
			
		public static void printRecord(int[] arr) {
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
		}
		
		public static void isEqual(int[] arr, int[] arr1) {
			int count=0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i] == arr1[i])

						count +=1;
			}
			if(count == arr.length) {
				System.out.println("Equal");
			}else {
				System.out.println("Not Equal");
			}
		}
		
  

	
	public static void main(String[] args) {
		int[] arr = Program2.getArray();
		int[] arr1 = Program2.getArray();
		Program2.acceptRecord(arr);
		Program2.acceptRecord(arr1);
		Program2.printRecord(arr);
		Program2.printRecord(arr1);
//		System.out.println(Program2.isEqual(arr, arr1));
		Program2.isEqual(arr, arr1);
		
		
		

	}


}
