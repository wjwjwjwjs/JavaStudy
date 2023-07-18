package ex15usefulcass;

/* Java의 규칙 : java.lang 패키지 하위믜 모든 클래스는 자동으로
 	import된다. 또한 정의하는 모든 클래스는 Object를 상속받게
 	되어있다.
 	따라서 java.lang 패키지의 모든 클래스는 별도의 선언없이 사용할
 	수 있고, Object에서 제공하는 메서드는 오버라이딩이 가능하다.*/

import java.lang.*; // 생략가능

// extends 역시 생략 가능
public class E03MathClass extends Object {

	/*
	Math 클래스
	- java.lang 패키지에 정의된 클래스
	- 수확과 관련된 일련의 작업들을 처리하는 메서드가 정의되어있다.
	- 메서드는 static으로 선언되어 있어 인스턴스 생성없이 클래스명으로
		호출 가능하다
	 */
	public static void main(String[] args) {

		System.out.println("원주율 : "+ Math.PI);
		
		float f = -3.14f;
		double d= -100.9;
		int num = - 10;
		
		System.out.println("### 절대값 ###");
		System.out.println("Math.abs : "+ Math.abs(f));
		System.out.println("Math.abs : "+ Math.abs(d));
		System.out.println("Math.abs : "+ Math.abs(num));

		System.out.println("### 올림 ###");
		System.out.println("Math.ceil : "+ Math.ceil(3.4));
		System.out.println("Math.ceil : "+ Math.ceil(-3.4));
		System.out.println("Math.ceil : "+ Math.ceil(3.9));
		
		System.out.println("### 내림 ###");
		System.out.println("Math.floor : "+ Math.floor(3.4));
		System.out.println("Math.floor : "+ Math.floor(-3.4));
		System.out.println("Math.floor : "+ Math.floor(3.9));
		
		// round의 경우 가장 가까운 정수로 받음 ex] 1.5 => 2, -1.5=>-1  
		System.out.println("### 반올림 ###");
		System.out.println("Math.round : "+ Math.round(3.49999));
		System.out.println("Math.round : "+ Math.round(3.54444));
		
		System.out.println("Math.round : "+ Math.round(-1.4));
		System.out.println("Math.round : "+ Math.round(-1.5));
		System.out.println("Math.round : "+ Math.round(-3.51));

		System.out.println("### 최대/최소 ###");
		System.out.println("Math.max : "+ Math.max(100,99));
		System.out.println("Math.min : "+ Math.min(100, 99));

		/* 0~1사이의 실수값을 반환한다. 따라서 정수값을 만들고
		싶을때는 특정한 값을 곱해주면 된다. */
		System.out.println("### 난수 ###");
		System.out.println((int)(Math.random()*45)+1);
		
		System.out.println("### 거듭제곱 ###");
		System.out.println("2의 10승은? " + Math.pow(2, 10));
		
		
	}

}
