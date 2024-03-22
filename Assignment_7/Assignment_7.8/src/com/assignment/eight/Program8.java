package com.assignment.eight;

import java.util.Arrays;

public class Program8 {

	public static void main(String[] args) {
		int[] arr = {5,14,35,89,140};
		int[] avg = new int[arr.length-2];
		for(int i=0; i<arr.length-2; i++) {
			 avg[i] = (arr[i]+arr[i+1]+arr[i+2])/3;
			
			}
		System.out.println(Arrays.toString(avg));
	}

}
