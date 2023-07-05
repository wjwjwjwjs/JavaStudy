package ex04controlstatement;

import java.io.IOException;
//import java.util.Scanner;

public class QuNumberYN {

	public static void main(String[] args) throws IOException {

//		Scanner scanner = new Scanner(System.in);
		System.out.println("하나의 숫자를 입력하세요 : ");
//		int a = scanner.nextInt();
		int a = System.in.read();
		String b = ((int)'0' <= a && a <= (int)'9') ? "숫자입니다" : "숫자가 아닙니다";
		System.out.println(b);
		
	}

}
