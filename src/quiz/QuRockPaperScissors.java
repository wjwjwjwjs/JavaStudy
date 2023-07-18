package quiz;

import java.util.Scanner;

public class QuRockPaperScissors {
	
	static void func() {
		Scanner h = new Scanner(System.in);
		System.out.print("다시할거면 1 아니면 0");
		int y = h.nextInt();
		if(y==1) {
			main(null);
		}
		else if(y==0) {
			System.out.println("게임 그ㅌ");
			return;
		}
		else {
			System.out.println("숫자모름?");
			func();
		}
	}

	public static void main(String[] args) {

	
		
		int i = 1;
		
		while(i<=5) {
			
			int a = (int)(Math.random()*3)+1;
			System.out.print("컴퓨터: "+ a);
			System.out.println();
			
			Scanner b = new Scanner(System.in);
			System.out.println("뭐내실? 가위(1) 바위(2) 보()3");
			int c = b.nextInt();
			
			
			if(c==1 || c==2 || c==3) {
				int d = c-a;
				switch (d) {
				case 1: case -2:
					System.out.println("사용자 승리");
					func();
					return;
				case -1: case 2:
					System.out.println("짐");
					break;
				case 0:
					System.out.println("비김");
					break;
				default:
					break;
				}
			}
			
			else {
				System.out.println("가위바위보 모름?");
				continue;
			}
			
			i++;
			if(i>5) {
				System.out.println("졌음");
				func();
			}
		}
		
		
	}

}
