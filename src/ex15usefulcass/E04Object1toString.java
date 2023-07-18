package ex15usefulcass;

/*
Object클래스
- 자바에서의 최상위 클래스이다.
- 별도의 선언없이 Object클래스에 정의된 모든 메서드를 호출할 수 있다.
- 개발자가 정의한 모든 클래스는 Object의 참조변수로 참조할 수 있다.
Ex] Object obj = new Person()
	혹은
	void myFunc(Object obj){}
	
toString 메서드
- Object에 정의된 메서드로 print()문이 문자열을 출력하기전에
	자동으로 호출하는 메서드이다.
- 인스턴스 변수를 문자열 형태로 변환하여 반환해준다.
- 필요한 경우 클래스 정의시 적절히 오버라이딩하여 재정의하는것이 좋다.
	단, 필수사항은 아니다.
 */

/* 해당 클래스는 toString()을 오버라이딩하여 멤버변수를 
 	변환하도록 정의하였다. */
class myFrineds extends Object{
	
	String myName;
	public myFrineds(String name) {
		myName = name;
	}
	
	@Override
	public String toString() {
		return "이름: "+ myName;
	}
}


// toString()을 오버라이딩 하지 않음
class yourFriends extends Object{
	
	String myName;

	public yourFriends(String name) {
		this.myName = name;
	}
	
}

public class E04Object1toString {

	public static void main(String[] args) {

		// 인스턴스 생성한다
		myFrineds fnd1 = new myFrineds("성유겸");
		yourFriends fnd2 = new yourFriends("헬로비너스");
		
		// toStirng()을 오버라이딩 했으므로 이름이 출력된다.
		System.out.println(fnd1);
		// 인스턴스의 참조값이 출력된다.
		System.out.println(fnd2);
		
	}

}
