package com.assignment.fourth;

import java.util.Scanner;

	public class Program4 {
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
	
	public static void reverseArray(int[] arr) {
		System.out.println("The reversed array is: ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = Program4.getArray();
		Program4.acceptRecord(arr);
		Program4.printRecord(arr);
		Program4.reverseArray(arr);
		

	}

}
