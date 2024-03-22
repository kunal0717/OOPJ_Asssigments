package com.assignment.sixth;


public class Program6 {
	public static void main(String[] args) {
		int[] a = {24,54,31,16,82,45,67};
		int k =3;
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
				}
			}
			if(i == k-1) {
				System.out.println("The 3rd largest element is: "+ a[i]);
			}
		}
	}
}

