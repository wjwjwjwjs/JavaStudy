package ex12inheritance;

import java.util.Scanner;

//친구의 정보를 저장할 기본클래스
class MyFriendInfo{
	private String name;
	int age;
	
	public MyFriendInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public void showMyFriendInfo() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
	}
}
//친구의 기본정보 외 상세정보를 저장할 클래스
class MyFriendDetailInfo extends MyFriendInfo
{
	private String addr;
  	private String phone;
  	
  	// 생성자 메서드 정의
  	public MyFriendDetailInfo(String name, int age, String addr, String phone) {
  		super(name,age);
  		this.addr = addr;
  		this.phone = phone;
  	}

	public void showMyFriendDetailInfo(){
		showMyFriendInfo();
		System.out.println("주소: "+ addr);
		System.out.println("전화: "+ phone);
	}
}
class QuMyFriendDetailInfo {
	public static void main(String[] args) {
		//이름, 나이, 주소, 전화번호를 인자로 객체를 생성…
		//정보Print
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름");
		String a = sc.nextLine();
		
		System.out.print("나이");
		int b = sc.nextInt();
		
		Scanner si = new Scanner(System.in);
		System.out.print("주소");
		String n = si.nextLine();
		
		System.out.print("전화번호");
		String d = si.nextLine();
		
		MyFriendDetailInfo mf = new MyFriendDetailInfo(a, b, n, d);
		mf.showMyFriendDetailInfo();
	}
}

