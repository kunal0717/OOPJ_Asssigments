package com.assignment.ninth;

public class Program9 {

	public static void main(String[] args) {
		int n =6;
		
		for(int i=1; i<=n; i++) {
			if(i%2 == 0) {
				System.out.print((i*i)+ " ");
			}else {
				System.out.print((i*i*i) + " ");
			}
		}

	}

}
