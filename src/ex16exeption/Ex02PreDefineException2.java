package ex16exeption;

import java.util.Scanner;

public class Ex02PreDefineException2 {

	public static void main(String[] args) {

		System.out.println("### NumberFormatExeption ###");
		Scanner sc = new Scanner(System.in);
		try {
			/* 입력시 정수가 아닌 문자 혹은 문자열을 입력하면
			정수로 변환이 불가능하므로 예외가 발생된다. */
			System.out.print("나이 입력 : ");
			String strAge = sc.nextLine();
			int ageAfter10 = Integer.parseInt(strAge)+10;
			System.out.println("당신의 10년후의 나이는: "+ ageAfter10);
		}
		catch (NullPointerException e) {
			
			System.out.println("나이는 숫자로만 입력가능");
			System.out.println("예외메세지: "+ e.getMessage());
			e.printStackTrace();
		
		}
		// end of main
	}

}
