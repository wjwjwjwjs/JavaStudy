package ex05method;

import java.util.Scanner;

public class QuCircleCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("반지름: ");
		double a = scanner.nextDouble();
		
		circleArea(a);
		System.out.println();
		circleRound(a);
	}
	
	static void circleArea(double b) {
		System.out.printf("원의 넓이(%f): %f",b , (3.14*b*b) );
	}
	
	static void circleRound(double b) {
		System.out.printf("원의 둘레(%f): %f",b , (3.14*b*2) );
	}
	
}
