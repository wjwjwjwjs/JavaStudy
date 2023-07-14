package ex06array;

import java.util.Scanner;

public class sim1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int [] num = new int [10];
		int count = 0;
		
		for(int i=0; i<10; i++) {
			System.out.print(i+1 +"번째 숫자 입력: ");
			num[i] = sc.nextInt();
			count += num[i];
		}
		System.out.println(count);
		
		
		num[2] = num[3];
		System.out.println(num[2]);
		
		int temp = 0 ;
		for(int i=0 ; i<9 ; i++) {	
			if(num[i]<num[i+1]) {	
				for(int j=i+1 ; j<9-i ; j++) {
					temp = num[i];
					num[i] = num[j];
					num[j] = num[i];
				}
				System.out.println(num[i]);
			}
			else {
				System.out.println(num[i]);
			}
		}
	}

}
