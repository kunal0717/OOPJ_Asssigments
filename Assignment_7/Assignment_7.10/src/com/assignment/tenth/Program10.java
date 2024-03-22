package com.assignment.tenth;

public class Program10 {
	public static void main(String[] args) {
		int[] arr1 = {5,14,35,90,139}; 
		int[] arr2 = {88,67,35,14,-12};
		int[] arr3 = {65,14,129,34,7};
		int count=0;
		for(int i=0; i<arr1.length-1; i++) {
			
			if(arr1[i] < arr1[i+1]) {
				count++;
			}
		}
		if(count == arr1.length-1) {
			System.out.println("Ascending");
			count =0;
		}
		
		for(int i=0; i<arr2.length-1; i++) {
			if(arr2[i] > arr2[i+1]) {
				count++;
			}
		}
		if(count == arr2.length-1) {
			System.out.println("Descending");
			count=0;
		}
		
		for(int i=0; i<arr1.length-1; i++) {
			if(arr3[i] < arr3[i+1]) {
				if(arr3[i] > arr3[i+1])
					count++;
			}
		}
		if(count != arr1.length-1)
			System.out.println("Random");
	}
}
