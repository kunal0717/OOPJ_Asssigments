package org.assignment.oopj;
import java.util.Scanner;

 class Student{
	private String name;
	private int rollNumber;
	float marks;
	
		public void details() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Name	:	"); 
			this.name = sc.nextLine();
			System.out.println("RollNumber   :   ");
			this.rollNumber = sc.nextInt();
			System.out.println("Marks   :   ");
			this.marks = sc.nextFloat();
			
			System.out.println(this.name + "  " + this.rollNumber + "  " + this.marks);
		}
}
 
 

public class Program {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.details();

	}

}
