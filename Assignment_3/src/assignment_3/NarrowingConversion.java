package assignment_3;

public class NarrowingConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number1 = 52.36d;
		int number2 = (int) number1; // This is narrowing..
		float number3 = (float) number1;
		long number4 = (long) number1;
		short number5 = (short) number1;
		byte number6 = (byte) number1;
		
		
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		System.out.println(number6);
	}

}
