package ex08class;

import java.util.Scanner;

/*
this의 두가지 활용법
1. 생성자에서 또 다른 생성자 호출(생성자 오버로딩)
	=> this(인수1, 인수2)
2. 멤버변수와 매개변수를 구분할때 사용
	=> this.멤버변수명
 */


class ChildProperty {
	
	int number;
//	String s;
	
	ChildProperty(int a){
		number = a;
	}
	
	
	
	void showProperty() {
		System.out.println(number);
	}


	int obtainBead(ChildProperty c, int i) {
		
//		if(c.number < i) {
//			System.out.println("범위 초과");
//			return obtainBead(c,i);
//		}
//		else {
		
			c.number -= i;
			number += i;
			return number;
//		}
			  
			
		/*
		해당 멤버메서드를 호출하는 어린이 객체는 게임에서 승리하여
		구슬을 획득해야하고, 매개변수로 전달되는 어린이 객체는 
		패배하여 구슬을 상실해야 한다. 
		 */
		// 패배한 어린이 인스턴스는 구슬을 차감한다
//		c.number -= i;
		// 승리한 어린이(객체 자신)은 구슬을 증가시킨다.
//		number += i;
//		return number;

	}
	
	

	
	
}

public class QuMarbles {

	public static void main(String[] args) {

		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 
		
		System.out.println();

		Scanner scanner = new Scanner(System.in);
		System.out.print("어린이1이 딴 구슬 갯수: ");
		int n = scanner.nextInt();
		
		System.out.print("어린이2이 딴 구슬 갯수: ");
		int m = scanner.nextInt();
		
		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, n);

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, m);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();

		
	}

}
