package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {

		int[] num10 = new int[10];
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0 ; i<num10.length ; i++) {
			System.out.println((i+1)+"번째 정수 입력: ");
			int a = scanner.nextInt();
			sum += a;
		}
		
		for(int i=0 ; i<num10.length ; i++) {
			for(int j=0; j<num10.length-1 ; j++) {
				if(!(num10[i]%2==0)) {
					int temp;
					temp = num10[i];
					num10[i] = num10[i+1];
					num10[i+1] = temp;
				}
				System.out.print(num10[i]);
			}
			
		}
		
		System.out.println("\n합: "+ sum);
		
	}

}
