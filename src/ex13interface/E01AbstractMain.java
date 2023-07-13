package ex13interface;

/*
추상 클래스
- 상속을 목적으로 제작되므로 인스턴스 생성 허용 x
- 추상클래스는 대부분 추상메서들 포함하고 있으므로, 이를
	상속받는 클래스는 반드시 추상메서드를 오버라이딩 해야함
- 클래스 상속관계에서 설계도와 같은 역할
- 인스턴스 생성 x 그외 참조 변수, 상속등의 모든기능 사용가능

추상 메서드
- 오버라이딩을 목적으로 제작된다.
- 메서드의 실행부가 없으므로 중괄호 대신 세미콜론(;)으로 마무리한다.
 */

// 추상클래스1 : 추상메서드를 포함하지 않은 클래스
abstract class AbsClass1{
	// int형으로 표현할 수 있는 최대값을 정적상수로 선언                                          
	public static final int Mqx_int = Integer.MAX_VALUE;
	
	// 일반적인 멤버메서드
	void instanceMethod() {}
	// 정적 메서드
	static void staticMethod() {}
}

/* 추상메서드를 포함하지 않는 추상클래스를 상속하면 오버라이딩은
강제사항이 아닌 선택사항이다. 즉, 필요한 경우에만 오버라이딩하면
된다. 아래 오버라이딩 한 메서드는 삭제해도 에러가 발생하지 않는다 */
class AbsClassChild1 extends AbsClass1{
	
	@Override
	void instanceMethod() {
		System.out.println("선택적 오버라이딩");
	}
}

/* 추상클래스2 : 추상메서드를 포함한 클래스. 
추상메서드를 멤버로 포함한 클래스는 반드시 abstract로 선언해야한다.
그렇지 않은면 에러가 발생한다. */
abstract class AbsClass2{
	/* 추상메서드는 실행부가 없으므로 {}를 기술하지 않는다.
	오버라이딩을 목적으로 생성한다. */
	abstract void absMethod(int number);
}

/* 위 클래스를 상속하면 부모가 가진 추상메서드를 그대로 상속받게
되므로 해당 클래스도 abstract로 선언해야한다. 단, 이 경우
해당 클래스로도 인스턴스를 생성할 수 없게된다. 따라서 객체생성을
위해서는 부모의 추상메서드를 자식쪽에서 오버라이딩 하면된다. */
class AbsClassChild2 extends AbsClass2{
	
	/* 오버라이딩은 부모쪽의 메서드를 가리고, 새로운 기능을
	재정의 하는것으로 해당 클래스는 추상메서드를 포함하지 않은
	상태가 된다. 따라서 인스턴스 생성이 가능해진다.
	아래 오버라이딩한 메서드를 삭제하면 에러가 발생한다. */
	@Override
	void absMethod(int number) {
		System.out.println("필수 오버라이딩");
	}
	void newMethod() {
		System.out.println("확장한 메소드");
	}
}

public class E01AbstractMain {

	public static void main(String[] args) {

		// 추상클래스는 인스턴스를 생성할 수 없다.
//		AbsClass1 absClass1 = new AbsClass1();
		
		// 추상클래스를 상속한 하위클래스는 인스턴스 생성을 할 수 있다.
		AbsClassChild1 absClassChild1 = new AbsClassChild1();
		
		/* 추상클래스는 인스턴스 생성은 할 수 없지만, 참조변수로는
		사용할 수 있다 */
		AbsClass2 absClass2 = new AbsClassChild2();
		// 부모쪽의 멤버메서드는 호출할 수 있다.
		absClass2.absMethod(100);
		// 하지만 자식쪽은 접근할 수 없으므로 다운캐스팅 해야한다.
		((AbsClassChild2)absClass2).newMethod();
		
		/* 추상클래스내에 선언된 정적메서드는 오버라이딩의 대상이
		될 수 없으므로 static의 기본규칙을 따른다. 별도의 생성 
		절차 없이 클래스명으로 바로 접근할 수 있다. */
		AbsClass1.staticMethod();
		AbsClassChild1.staticMethod();
		System.out.println("int형의 최대값: "+ AbsClass1.Mqx_int);
		
	}

}