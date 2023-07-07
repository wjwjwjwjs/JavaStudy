package ex08class;

public class Triangle {
	
	/* 개발자가 생성자를 별도로 선언하지 않으면
	디폴트 생성자는 자동으로 생성된다. 디폴트 생성자느느
	아래와 같이 매개변수도 없고 실행부도 없는 형태이다 */
	// public Triangle() {}

	double width ;
	double height ;
	
	// 초기화 메서드, 멤버변수 초기화
	void init(double a, double b) {
		width = a;
		height = b;
	}
	
	double getArea() {
//		System.out.println((width*height)/2);
//		this.width =width ;
		/* 반환값이 실수일 가능성이 높다 */
		double c = (width*height)/2 ;
		return c;
	}
	
	void setBottom(double width) {
		// 매개변수와 멤버변수명이 다르면 this가 없어도 된다.
		// 만약 이름이 같다면 멤버변수를 가리키는 this를 추가한다. 
		this.width = width ; 
	}
	
	void setHeight(double height) {
		this.height = height;
	}
	
}
