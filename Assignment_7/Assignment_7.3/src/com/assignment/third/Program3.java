package com.assignment.third;

public class Program3 {

	public static void main(String[] args) {
		int[] arr1 = {1,12,16,3,6,9,4};
		int sum = 13;
		
		for(int i=0; i<arr1.length-1; i++) {
			for(int j=i+1; j<arr1.length; j++) {
				if(arr1[i] + arr1[j] == sum) {
					System.out.print("The elements are: " +arr1[i]+","+arr1[j]+"\n");
				}
			}
		}
	}

}
