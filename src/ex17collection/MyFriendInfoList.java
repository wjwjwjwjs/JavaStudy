package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


class Friend{
	
	// 멤버변수 : 이름, 전화번호, 주소 기본정보 3가지를 저장
	String name; 
	String phone;
	String addr;
	
	//생성자 : 멤버변수 초기화
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	
	// 멤버변수 전체를 출력하기 위한 멤버메서드
	public void showAllData() {
		System.out.println("이름: "+ name);
		System.out.println("전화번호: "+ phone);
		System.out.println("주소: "+ addr);
	}
	
	public void showBasicInfo() {}	
}

// 고등학교 친구의 정보를 저장할 클래스
class HighFriend extends Friend{
	
	// 확장한 멤버변수 : 별명
	String nickname;

	// 생성자 : 부모의 생성자를 먼저 호출한 후 멤버변수 초기화.
	public HighFriend(String name, String phone, String addr, String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}
	
	@Override
	public void showAllData() {
		System.out.println("===고딩친구(전체정보)===");
		super.showAllData();
		System.out.println("별명: "+ nickname);
	}
	
	@Override
	public void showBasicInfo() {
		System.out.println("===고딩친구===");
		System.out.println("별명: "+ nickname);
		System.out.println("전번: "+ phone);
	}
}

// 대학교 친구 정보를 저장하기 위한 클래스
class UnivFriend extends Friend{
	
	// 확장한 멤버변수로 전공과목을 표현
	String major;

	// 생성자ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	} 
	
	// 오버라이딩 1
	@Override
	public void showAllData() {
		System.out.println("===대딩친구(전체정보)===");
		super.showAllData();
		System.out.println("전공: "+ major);
	}
	// 오버라이딩 2 HighFrend클라스와 동일 패턴으로 정의
	@Override
	public void showBasicInfo() {
		System.out.println("===대딩친구===");
		System.out.println("이름: "+ name);
		System.out.println("전화번호: "+ phone);
	}
	
}

// 메인클래스
public class MyFriendInfoList {
	
	public static void menuShow() {
		System.out.println("==============메뉴입력============");
		System.out.print("1.고딩친구입력 ");
		System.out.println("2.대딩친구입력");
		System.out.print("3.전체정보출력 ");
		System.out.println("4.간략정보출력");
		System.out.print("5.검색 ");
		System.out.print("6.삭제 ");
		System.out.println("7.프로그램종료");
		System.out.println("메뉴선택>>>");
	}

	public static void main(String[] args) {

		// 사용자 입력을 위한 인스턴스 생성
		Scanner scan = new Scanner(System.in);
		/* 기능을 담당하는 핸들러 클래스의 인스턴스 생성. 컬렉션은 생성시
		 크기를 저장할 필요가 없다. 데이터의 갯수에 따라 자동으로
		 증가된다. */
		FrinedInfoHandler handler 
					= new FrinedInfoHandler();
		
		while(true) {
			
			// 1. 메뉴출력
			menuShow();
			
			// 2. 사용자는 수행할 기능의 메뉴를 선택
			int choice = scan.nextInt();
			
			// 3. 선택한 번호에 따라 switch문으로 각 메서드 호출
			switch (choice) {
			case 1: case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showSimpleData();
				break;
			case 5:
				handler.searchInfo();
				break;
			case 6:
				handler.deleteInfo();
				break;
			case 7:
				System.out.println("프로그램종료");
				return;
			}
			// switch 끝
		}
		// while끝
	}
	// main 끝
}
// class 끝

class FrinedInfoHandler{
	
	// 멤버변수
//	private Friend[] myFrineds;
//	private int numOfFriends;
	/* 기존 인스턴스 배열에 저장했던것을 컬렉션으로 변경한다.
	컬렉션은 제네릭을 기반으로 하므로 인스턴스 생성시 저장할
	객체의 타입을 결정하게된다. 여기서는 Friend클래스를
	상속한 High, Univ를 저장할 것이므로 아래와 같이
	선언하면 된다. */
	ArrayList<Friend> myFriends;
	
	/* 생성자 : 컬렉션은 데이터 저장시 자동인덱싱이 되므로 크기는 필요없다. */
	public FrinedInfoHandler() {
//		// 정보를 저장 할 인스턴스 배열을 생성한다.
//		myFrineds = new Friend[num];
//		// 배열의 인덱스는 0부터 시작이므로 이와같이 초기화한다.
//		numOfFriends = 0;
		
		// 생성자에서 정보를 저장할 List계열의 컬렉션을 생성한다.
		myFriends = new ArrayList<Friend>();
	}
	
	/*
	연습문제] List 컬렉션을 기반으로 친구(고딩/대딩)정보를
		추가하는 프로그램을 작성하시오. 1차는 추가/ 출력1/
		출력2 까지 진행합니다
		출력1은 확장 for문을 통해 구현하세요.
		출력2는 이터레이터를 통해구현하세요
	 */
	// 친구 정보 추가 
	public void addFriend(int choice) {
		
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		System.out.print("이름: ");
		iName = scan.nextLine();
		System.out.print("전화번호: ");
		iPhone = scan.nextLine();
		System.out.print("주소: ");
		iAddr = scan.nextLine();
		if(choice==1) {
			// 고딩친구 정보 추가
			System.out.print("별명: ");
			iNickname = scan.nextLine();
			
			/* High인스턴스를 생성한다. 해당 인스턴스는 자신의 타입이나
			부모타입인 Friend에 저장할 수 있다. */
			Friend list3 = new HighFriend(iName, iPhone, iAddr, iNickname);
			myFriends.add(list3); 
		}
		else if(choice==2) {
			// 대딩친구 정보 추가
			System.out.print("전공: ");
			iMajor = scan.nextLine();
			myFriends.add(
			   new UnivFriend(iName, iPhone, iAddr, iMajor));
//			myFriends.add(list4);
		}
		/* 기존 객체배열은 정보를 추가할때마다 인덱싱을 위해
		변수를 ++하는 부분이 필요했지만, List의 경우 자동인덱싱을
		지원하므로 단지 추가만 해주면 된다. 추가시에는 add()를 
		사용한다. */
		
	}
	//// end of addFriend
	
	
	// 저장된 연락처 전체정보 출력 확장 for문
	public void showAllData() {
		/*
		확장 for문의 형식
			=> for(저장된타입 참조변수 : 반복할 배열 혹은 컬렉션)
		 */
		for(Friend mf : myFriends) {
			mf.showAllData();
		}

	}
	

	// 저장된 연락처 간략정보 출력 iterator
	public void showSimpleData() {
		
		Iterator<Friend> it2 = myFriends.iterator();
		while(it2.hasNext()) {
			it2.next().showBasicInfo();
		}

	}
	
	// 연락처 정보 검색
	public void searchInfo() {
		
		
		
//		// 검색결과가 있는지 확인하기 위한 변수
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요");
		String searchName = scan.nextLine();
		
		
		for(Friend mf : myFriends) {
			if(searchName.compareTo(mf.name)==0) {
				mf.showAllData();
				isFind = true;
				break;
			}
		}
		if(isFind == false) {
			System.out.println("그런사람없다");
		}
		
//		Iterator<Friend> it3 = myFriends.iterator();
		
//		
//		// 배열에 저장된연락처의 갯수만큼 반복한다.
//		for(int i=0; i<numOfFriends; i++) {
//			/* 배열의 각 인덱스에 저장된 인스턴스의 참조값을 통해
//			멤버변수에 접근한다. 검색을 위해 입력한 이름과 비교해서
//			일치하는 경우에만 정보를 출력한다. 이때 equals()를
//			사용해도 결과는 동일하다. */
//			if(searchName.compareTo(myFrineds[i].name)==0) {
//				// 연락처의 전체정보를 출력한다.
//				myFrineds[i].showAllData();
//				System.out.println("**귀하가 요청하는 정보를 찾았습니다.**");
//				// 확인용 변수는 true로 변경한다.
//				isFind = true;
//			}
//		}
//		// 만약 검색결과가 없다면 아래와 같이 출력한다.
//		if(isFind == false) {
//			System.out.println("***찾는 정보는 없습니다***");
//		}
	}
	// end of searchInfo
	
	// 연락처 정보 삭제
	public void deleteInfo() {
		
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요");
		String deleteName = scan.nextLine();
		
		
		Iterator<Friend> it4 = myFriends.iterator();
		
		while(it4.hasNext()) {
			Friend fr = it4.next();
			if(fr.name.equals(deleteName)) {
				myFriends.remove(fr);
				isFind = true;
				break;
			}
			
		}
		if(isFind == false) {
			System.out.println("그런사람없다");
		}
			
		
		
//		for(Friend mf : myFriends) {
//			
//			if(deleteName.compareTo(mf.name)==0) {
//				myFriends.remove(mf);
//				isFind = true;
//			}
//			
//		}
//		if(isFind == false) {
//			System.out.println("그런사람없다");
//		}

//		Scanner scan = new Scanner(System.in);
//		System.out.println("삭제할 이름을 입력하세요: ");
//		String deleteName = scan.nextLine();
//		/* 배열의 원소 중 삭제된 원소의 인덱스값을 저장하기 위한
//		변수로 삭제한 후 빈자리를 채워넣을 때 사용한다. 인덱스는
//		0부터 시작이므로 -1을 초기값으로 설정한다. */
//		int deleteIndex = -1;
//		
//		// 삭제할 데이터를 찾기위해 저장된 갯수만큼 반복한다.
//		for(int i=0 ; i<numOfFriends ; i++) {
//			// 입력된 이름과 일치하는지 확인한다.
//			if(deleteName.compareTo(myFrineds[i].name)==0) {
//				/* 인스턴스 배열에서 삭제하는 null로 변경하면된다.
//				참조값이 null이라는것은 참조할 인스턴스가 없다는
//				의미이므로 삭제한것과 동일한 결과가된다. */
//				myFrineds[i] = null;
//				// 삭제된 원소의 index를 저장한다.
//				deleteIndex = i;
//				// 전체 카운트를 1 차감한다.
//				numOfFriends--;
//				// 하나의 객체를 삭제하면 즉시 for문을 탈출한다.
//				break;
//			}
//		}
//		
//		// 검색된 데이터가 없다면 -1을 유지한다.
//		if(deleteIndex==-1) {
//			System.out.println("==삭제된 데이터가 없습니다==");
//		}
//		else {
//			/* 인스턴스 배열에서 원소를 삭제한 후 바로 뒤에 있는
//			원소를 앞으로 하나씩 복사한다. 만약 이 부분이 처리되지
//			않는다면 차후 검색이나 삭제시 NullPointerExeption이
//			발생할 수 있다. */
//			for(int i=deleteIndex ; i<numOfFriends ; i++) {
//				myFrineds[i] = myFrineds[i+1];
//			}
//			System.out.println("==데이터("+ deleteIndex + "번)가 삭제되었습니다==");
//		}
	}
	// end of deleteInfo
	
}



