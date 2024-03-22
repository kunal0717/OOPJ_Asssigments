package com.assignment.seventh;

import java.util.Arrays;

public class Program7 {

	public static void main(String[] args) {
		int[] a = {23,60,94,3,102};
		int[] b = {42,16,74};
		int clength = a.length + b.length;
		int[] c = new int[clength];
		
		int i=0, j=0, k=0;
		
		while(i<a.length && j<b.length) {
			c[k++] = a[i++];
			c[k++] = b[j++];
		}
		
		
		while(i<a.length) {
			c[k++] = a[i++];
		}
		
		while(j<b.length) {
			c[k++] = b[j++];
		}
		
		System.out.println(Arrays.toString(c));
		
		
		
	}

}
