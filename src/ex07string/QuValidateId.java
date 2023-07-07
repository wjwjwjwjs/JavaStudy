package ex07string;

import java.util.Scanner;

public class QuValidateId {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		
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
