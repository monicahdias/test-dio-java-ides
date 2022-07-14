package dio.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Type the first number: ");
		a = scan.nextInt();
		System.out.println("Type the second number: ");
		b = scan.nextInt();
		
		double sum = sum(a,b);
		double sub = sub(a,b);
		double mul = mul(a,b);
		double div = div(a,b);
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
	}
	
	public static double sum(double a, double b) {
		return a + b;
	}
	
	public static double sub(double a, double b) {
		return a - b;
	}
	
	public static double mul(double a, double b) {
		return a * b;
	}
	
	public static double div(double a, double b) {
		return a / b;
	}
	
	
}
