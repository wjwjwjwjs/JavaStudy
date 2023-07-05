package ex05method;

import java.util.Scanner;

public class E04MethodType03_2 {

	/*
	연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아
	그에 해당하는 구구단을 출력하는 메소드를 작성하시오.
	무조건 첫번째 입력받는수가 작아야한다.
	입력예]
		첫번째숫자 : 3
		두번째숫자 : 12
		3*1=3 3*2=6........
		........
		...................12*9=108
	메소드명 : inputGugudan(int sNum, int eNum)
	 */

	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 숫자: ");
		int s = scanner.nextInt();
		System.out.println("마지막 숫자: ");
		int e = scanner.nextInt();
		
		inputGugudan(s, e);
		
		System.out.println("\n================\n");
		
		inputGugudan2(s, e);
		
		System.out.println("\n================\n");
		
		inputGugudan3(s, e);
	}
	
	
	static void inputGugudan(int sNum, int eNum) {
		
		for(int i=sNum ; i <= eNum ; i++) {
			for(int j=1; j<=9 ; j++) {
				System.out.printf("%d*%d =%2d ", i, j, (i*j));
			}
			System.out.println();
			
		}
	}
	
	static void inputGugudan2(int sNum, int eNum) {
		
		for(int i=sNum ; i <= eNum ; i++) {
			if(i%2==0) {
				for(int j=1; j<=9 ; j++) {
					System.out.printf("%d*%d =%2d ", i, j, (i*j));
				}
				System.out.println();
			}

		}
		
	}
	
	static void inputGugudan3(int sNum, int eNum) {
		
		for(int i=eNum ; i >= sNum ; i--) {
			
				for(int j=1; j<=9 ; j++) {
					System.out.printf("%d*%d =%2d ", i, j, (i*j));
				}
				System.out.println();
			

		}
		
	}

}
