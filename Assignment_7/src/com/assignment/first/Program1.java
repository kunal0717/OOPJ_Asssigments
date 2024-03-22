package com.assignment.first;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		System.out.println("Enter the elements: ");
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
	
	public static void main1(String[] args) {
		int[] arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		System.out.println("arr[0] = "+ arr[0]);
		System.out.println("arr[1] = "+ arr[1]);
		System.out.println("arr[2] = "+ arr[2]);
	}

}
