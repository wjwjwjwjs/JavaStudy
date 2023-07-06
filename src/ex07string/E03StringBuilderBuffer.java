package ex07string;

/*
StringBuffer클래스
: String클래스는 기존 문자열에 새로운 문자열을 추가하면 새롭게
생성된 메모리에 문자열을 저장한다. 기존 메모리가 소멸되고 새로운
메모리가 생성되는 낭비를 막기위해, 문자열의 변경이 많은 경우에는
StringBuffer 클래스를 사용하는것이 좋다. 해당 클래스는 기존
메모리의 문자열을 변경하는 방식으로 추가한다.
 */
public class E03StringBuilderBuffer {

	public static void main(String[] args) {

		/*
		append() : 문자열의 끝에 새로운 문자열을 연결한다.
		insert() : 지정한 인덱스 위치에 문자열을 삽입한다.
		 */
		// 문자열 연결
		StringBuffer strBuf = new StringBuffer("AB");
		// 정수 연결
		strBuf.append(25);
		// boolean값 연결(메서드 체인 호출 가능)
		strBuf.append("Y").append(true);
		System.out.println("strBuf= "+ strBuf);
		
		// 인덱스 2에 false를 삽입한다.
		strBuf.insert(2, false);
		// 문자열의 길이를 통해 마지막 부분에 추가한다.
		strBuf.insert(strBuf.length(), 'z');
		System.out.println("strBuf="+ strBuf);
		
		
		System.out.println("String과 StringBuffer의 참조값 비교");
		/* 더블쿼테이션으로 동일한 문자열 인스턴스를 생성했으므로
		동일한 주소값을 가진다. */
		String str1 = "Java&JSP";
		String str2 = "Java&JSP";
		if(str1==str2) {
			System.out.println("연결전 : 주소값동일");
		}
		else {
			System.out.println("연결전 : 주소값다름");
		}
		
		/* String 클래스는 문자열의 변경이 있는 경우 기존
		메모리를 소멸하고 새로운 메모리를 할당한다. */
		str1 = str1 + "&Spring";
		if(str1 == str2) {
			System.out.println("연결후 : 주소값동일");
		}
		else {
			// 출력
			System.out.println("연결후 : 주소값다름");
		}
		
		/* StringBuffer 클래스는 문자열을 저장하기 위해
		기본 메모리를 16으로 할당한다. 차후 저장할 공간이 부족하면
		자동으로 메모리를 확장한다. */
		StringBuffer buf = new StringBuffer();
		System.out.println("buf="+ buf);
		System.out.println("저장된 문자열 크기: "+ buf.length());
		System.out.println("기본버퍼크기: "+ buf.capacity());
		
		buf.append("Java 공부중..");
		System.out.println("buf= "+ buf);
		System.out.println("저장된 문자열크기: "+ buf.length());
		System.out.println("기본버퍼크기: "+ buf.capacity());
		
		buf.append("금일은 StringBuffer 학습중..!!");
		System.out.println("buf= "+ buf);
		System.out.println("저장된 문자열크기: "+buf.length());
		System.out.println("기본버퍼크기: "+ buf.capacity());
		
	}

}
