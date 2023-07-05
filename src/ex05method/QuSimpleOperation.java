package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("a: ");
		int a = scanner.nextInt();
		System.out.print("b: ");
		int b = scanner.nextInt();
		
		arithmetic(a,b);
		
	}
	
	static void arithmetic(int num1, int num2) {
		
		System.out.println("덧셈결과: "+ (num1+num2));
		System.out.println("뺄셈결과: "+ (num1-num2));
		System.out.println("곱셈결과: "+ (num1*num2));
		System.out.println("나눗셈 몫: "+ (num1/num2));
		System.out.println("나눗셈 나머지: "+ (num1%num2));
	}
	
	

}
