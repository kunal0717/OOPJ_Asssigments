package org.assignment.oopj2;

import java.util.Scanner;

class Employee{
	private String name;
	private int empid;
	private float salary;
	
	Scanner sc = new Scanner(System.in);
		public void details() {
			System.out.println("Name	:	");
			this.name = sc.nextLine();
			System.out.println("EmpId	:	");
			this.empid = sc.nextInt();
			System.out.println("Salary	:	");
			this.salary = sc.nextFloat();
			
			System.out.println(this.name + "	"+this.empid+"	"+this.salary);
		}
		
		public void details(String name) {
			this.name = name;
			System.out.println("EmpId	:	");
			this.empid = sc.nextInt();
			System.out.println("Salary	:	");
			this.salary = sc.nextFloat();
			
			System.out.println(this.name + "	"+this.empid+"	"+this.salary);
		}
}

public class Program {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.details();
		emp.details("Akash");
		
		Employee emp1 = new Employee();
		emp1.details();
		emp1.details("Krishna");

	}

}
