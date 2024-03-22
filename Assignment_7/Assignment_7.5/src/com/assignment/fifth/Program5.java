package com.assignment.fifth;

import java.util.Scanner;

public class Program5 {
	private  static Scanner sc = new Scanner(System.in);
	public static int[] getArray() {
		int[] arr = new int[5];
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
	
	public static void largest(int[] arr) {
		int i;
		int max = arr[0];
			for(i=1; i<arr.length; i++) {
				if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum is: " +max);
	}
	
	public static void smallest(int[] arr) {
		int i;
		int min = arr[0];
			for(i=1; i<arr.length; i++) {
				if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum is : "+min);
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = Program5.getArray();
		Program5.acceptRecord(arr);
		Program5.printRecord(arr);
		Program5.largest(arr);
		Program5.smallest(arr);
		
	}

}
