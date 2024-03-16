package org.assignment.oopj2;

import java.util.Scanner;

class Vehicle{
	private String color;
	private int wheels;
	private String name;
	
	Scanner sc = new Scanner(System.in);
		public void builtType() {
			System.out.println("Color	:	");
			this.color = sc.nextLine();
			System.out.println("Wheels	:	");
			this.wheels = sc.nextInt();
			sc.nextLine();
			System.out.println("Model_Name	:	");
			this.name = sc.nextLine();
				
			System.out.println(this.color + "	" + this.wheels + "	" + this.name);
		}
			
		public void builtType(String color) {
//			sc.nextLine();
//			System.out.println("Color   :   ");
			this.color = color;
			System.out.println("Wheels  :   ");
			this.wheels = sc.nextInt();
			sc.nextLine();
			System.out.println("Model_Name   :   ");
			this.name = sc.nextLine();
			
			System.out.println(this.color + "	" + this.wheels + "	" + this.name);
		}
		
		public void builtType(String color, int wheels) {
//			sc.nextLine();
//			System.out.println("Color   :   ");
			this.color = color;
//			System.out.println("Wheels   :   ");
			this.wheels = wheels;
//			sc.nextLine();
			System.out.println("Model_Name   :   ");
			this.name = sc.nextLine();
			
			System.out.println(this.color + "	" + this.wheels + "	" + this.name);
		}
	
}


public class Program {
	public static void main(String[] args) {
		Vehicle V = new Vehicle();
		
			V.builtType();
			V.builtType("Red");
			V.builtType("Black", 2);

	}

}
