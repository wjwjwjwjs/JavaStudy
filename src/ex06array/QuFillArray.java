package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {

		int[] num10 = new int [10];
//		int[] a = new int [10];
		int sum = 0;
//		System.out.println(num10.length);
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0 ; i<num10.length ; i++) {
			
			System.out.print(i+"번째 배열값: ");
			num10[i] = scanner.nextInt();
			
			sum += num10[i];	
			
		}
		System.out.println("합: "+ sum);
		
		
		for(int i=0 ; i<num10.length-1 ; i++) {
				
				if(num10[i]<num10[i+1]) {
					int temp;
					for(int j=i ; j<num10.length ; j++) {
						temp = num10[j];
						num10[j] = num10[j+1];
						num10[j+1] = temp;
						System.out.print(num10[j]+ " ");
					}
//					System.out.print(num10[j]+ " ");
				}
				else {
					System.out.print(num10[i]+ " ");
				}
			
			
		}
		
//		for(int j=0 ; j<num10.length ; j++) {
//			
//			if(num10[0]<num10[1]) {
//				int temp = num10[0];
//				num10[0] = num10[1];
//				num10[1] = temp;
//				System.out.print(num10[0]);
//			}
//			else {
//				System.out.print(num10[0]);
//			}
//		}
		
//		if(num10[0]<num10[1]) {
//			int temp = num10[0];
//			num10[0] = num10[1];
//			num10[1] = temp;
//			System.out.print(num10[0]);
//		}
//		else {
//			System.out.print(num10[0]);
//		}
		
		
	}	
}
