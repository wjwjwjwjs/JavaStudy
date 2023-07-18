package quiz;

import java.util.Scanner;

public class QuUpDownGame {
	
	static int updown(int a, int c) {
		if(a>c) {	
			return 1;
		}
		else if(a<c){
			return 2;
		}
		else if(a==c) {
			return 3;
		}
		return 0;
	}
	
	static int uptown1(int i) {
		Scanner r = new Scanner(System.in);
		System.out.print("재시작 할거면 1, 아니면 0");
		int t = r.nextInt();
		switch (t) {
		case 1:
			main(null);
			System.out.println();
			return i = 0;
		case 0:
			return 0;
		default:
			return uptown1(i);
		}
	}

	public static void main(String[] args) {

		int a = (int)(Math.random()*100+1);
		System.out.println("컴퓨터 숫자 : "+ a);
		int i = 1;
		
		
		while (i<=7) {
			
			Scanner b = new Scanner(System.in);
			System.out.print(i+"번째 숫자입력 : ");
			int c = b.nextInt();
			
			switch (updown(a, c)) {
			case 0:
				System.out.println("잘못됨");
				break;
			case 1:
				System.out.println("컴퓨터 숫자가 높다");
				break;
			case 2:
				System.out.println("사용자 숫자가 높다");
				break;
			case 3:
				System.out.println("정답");
				uptown1(i);
				return ;
			default:
				break;
			}	
			i++;
			if(i>7) {
				uptown1(i);
			}
		}
	}

}
