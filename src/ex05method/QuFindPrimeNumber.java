package ex05method;

import java.util.Scanner;

public class QuFindPrimeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("1에서 100사이의 숫자만 입력: ");
		int a = scanner.nextInt();
		isPrimeNumber(a);
		
	}
	

	static void isPrimeNumber(int b) {
		
		for(int i=1 ; i<=100 ; i++) {
			int count = 0 ;
			for(int j=1 ; j<=i; j++) {
				
				
				if(i%j == 0) {
					count ++;
				}
				
			}
			if(count == 2) {
				System.out.println(i);
			}
			
	
		}
		
		
		
		for(int i=1 ; i<=b ; i++) {
			int count = 0 ;
			for(int j=1 ; j<=b; j++) {
				
				
				if(b%j == 0) {
					count ++;
				}
				
			}	
			if(count == 2) {
				System.out.println("소수다"+ b);
				return;
			}
			else {
				System.out.println("소수아님" +b);
				return;
			}
	
		}
		
		

		
	}
}
