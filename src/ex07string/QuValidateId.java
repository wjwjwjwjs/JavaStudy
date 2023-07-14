package ex07string;

import java.util.Scanner;

public class QuValidateId {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		/*
		만약 String을 Javascript처럼 배열처럼 만들고 싶다면
		toCharArray() 메서드를 사용하면된다.
		해당 메서드는 String을 char타입의 배열로 변환해준다
		
		char[] charArr = id.toCharArray();
		for(int i=0; i<charArr.length ; i++){
			System.out.print(charArr[i]+"-");
		}
		 */
		
		
		if(a.length()<=12 && a.length()>=8) {
			
			for(int i=0 ; i<a.length(); i++) {
				if((int)a.charAt(i)<='9' && (int)a.charAt(i)>='0'
						&& (int)a.charAt(i)>='a' && (int)a.charAt(i)>='z') {
					
					System.out.println("사용할 수 있는 아이디");
				}
			}
			
		}
		else {
			System.out.println("사용할 수 없는 아이디");
		}
		
	}

}
