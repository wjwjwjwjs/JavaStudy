package ex05method;

import java.util.Scanner;

public class QuTemperature {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("화씨온도 섭씨온도 변환, 화씨온도: ");
		double a = scanner.nextDouble();
		double result1 = Fahrenheit(a);
		System.out.println("화씨온도 섭씨온도 변환값 : "+ result1);
		
		System.out.print("섭씨온도 화씨온도 변환, 섭씨온도: ");
		double a1 = scanner.nextDouble();
		double result2 = Celsius(a1);
		System.out.println("섭씨온도 화씨온도 변환값 : "+ result2);
		
	}
	
	static double Fahrenheit(double b) {
		
		double c = (1.8*b+32);
		return c;
	}
	
	static double Celsius(double b) {
		
		double c = ((b-32)/1.8);
		return c;
	}

}
