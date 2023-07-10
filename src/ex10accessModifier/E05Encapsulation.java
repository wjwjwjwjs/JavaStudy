package ex10accessModifier;

/*
캡슐화(Encapsulation)
: 여러가지 업무 로직을 하나로 묶는다는 의미와, 업무의 순서까지
고려한 형태의 로직을 구성한다는 의미를 가지고있다. 즉, 관련있는
로직을 하나로 묶어주는 것을 말한다
 */
// 아래 4가지 업무는 번호순서대로 진행해야 한다고 가정한다.
class MemberRegist {
	void doMemberRegist() {
		System.out.println("1. 회원가입을 진행합니다.");
	}
}

class CongratulationPoint {
	void doCongratulationPoint(){
		System.out.println("3. 가입축하 10포인트 지급합니다.");
	}
}

class AutoLogin{
	void doAutoLogin() {
		System.out.println("2. 자동로그인");
	}
}

class FristLoginEvent{
	void doFristLoginEvent() {
		System.out.println("4. 첫 로그인 이벤트 페이지로 이동합니다");
	}
}

/*
업무의 순서를 고려하여 관련되 ㄴ메서드를 하나의 클래스로 정의한다.
차후에는 별도의 분석 작업없이 해당 클래스의 doProcess() 메서드만
호출하면 업무는 차질없이 진행될것이다.
 */
class EncapsulLogic{
	
	// 각 업무르 ㄹ담당할 클래스르 ㄹ통해 인스턴스를 생성한다.
	MemberRegist memberRegist = new MemberRegist();
	FristLoginEvent fristLoginEvent = new FristLoginEvent();
	AutoLogin autoLogin = new AutoLogin();
	CongratulationPoint congratulationPoint = new CongratulationPoint();
	
	// 업무의 순서를 고려하여 캡슐화된 메서드를 정의한다.
	void doProcess() {
		memberRegist.doMemberRegist();
		autoLogin.doAutoLogin();
		congratulationPoint.doCongratulationPoint();
		fristLoginEvent.doFristLoginEvent();
	}
	
}

public class E05Encapsulation {

	public static void main(String[] args) {

		System.out.println("캡슐화 전 코드");
		
		/* 업무의 진행순서가 중요하다고 가정했을때 캡슐화 이전의
		코드에서는 개발자가 순서를 지키지 않은 상태에서도 실행이
		가능한 코드가 된다. 즉, 업무의 차질이 발생될 수 있다.
		 */
		MemberRegist memberRegist = new MemberRegist();
		FristLoginEvent fristLoginEvent = new FristLoginEvent();
		AutoLogin autoLogin = new AutoLogin();
		CongratulationPoint congratulationPoint = new CongratulationPoint();
		
		memberRegist.doMemberRegist(); //회원가입
		autoLogin.doAutoLogin(); //자동 로그인
		congratulationPoint.doCongratulationPoint(); // 이벤트 페이지 이동
		fristLoginEvent.doFristLoginEvent(); // 축하 포인트 지급
		
		System.out.println("==============");
		
		// 아래 메서드 호출을 통해 멉무를 순서에 맞게 진행할 수 있다.
		System.out.println("캡슐화 이후 코드");
		new EncapsulLogic().doProcess();
	}

}
