package ex07string;

import java.util.Scanner;

public class E02StringMethod4 {

	public static void main(String[] args) {

		/*
		시나리오] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("주민번호 입력(-포함해서 입력): ");
		String a = scanner.nextLine();
		
		if(a.contains("-")) {
			String[] b = a.split("-");
			System.out.println(b[0]);
			System.out.println(b[1]);
			
			
			
			  if(b[0].length()==6 && b[1].length()==7) {
				if(!(a.charAt(6) == '-')) {
					System.out.println("주민번호 형식 아님");
				}
				else{
					
					// String y = b[0];
					for(int i=0 ; i<b[0].length() ; i++) {
//						char [] t = null;
						char t =  b[0].charAt(i);
						if(!('0'<=(int)t && (int)t<='9')) {
							System.out.println("주민번호 형식 아님");
							return;
						}
										
					}
					
					for(int i=0 ; i<b[1].length() ; i++) {
						char t =  b[1].charAt(i);
						if(!('0'<=(int)t && (int)t<='9')) {
							System.out.println("주민번호 형식 아님");
							return;
						}
										
					}
					
					System.out.println("주민 번호 형식임");
					
					if(b[1].charAt(0)%2==0) {
						System.out.println("여자");
					}
					else {
						System.out.println("남자");
					}
					
					
//					for(int i=0 ; i<a.length() ; i++) {
//						t[i] = a.charAt(i);
//		
//						if(!('0'<=t[i] && t[i]<='9' && t[i] == '=')) {
//							System.out.println("주민번호 형식아님");
//						}
//					}
				}

//				for(int i=0 ; i<b.length ; i++) {
//					t[i] = a.charAt(i);
//	
//					if('0'<=t[i] && t[i]<='9' && ) {
//						
//					}
//				}
			}
			
//			if(b[1].charAt(0)%2==0) {
//				System.out.println("여자");
//			}
//			else {
//				System.out.println("남자");
//			}
		}
		else {
			System.out.println("주민번호 형식 아님");
		}
//		else {
//			return;
//		}
//		String[] b = a.split("-");
//		if(b[1].indexOf(0)%2==0) {
//			System.out.println("여자");
//		}
//		else {
//			System.out.println("남자");
//		}
		
		/*
		시나리오] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		
		System.out.print("이메일 입력: ");
		String c = scanner.nextLine();
		
		
			if(c.contains("@")==true){
				String[] d = c.split("@");
				if(d[1].contains(".")==true){
					System.out.println("이메일 형식임");
				}
				else {
					System.out.println("이메일 형식 아님");
				}
				
			}
			else {
				System.out.println("이메일 형식 아님");
			}
	
		
		
//		if(c.contains("@")==true){
//			String[] d = c.split("@");
//			if(d[1].contains(".")==true){
//				System.out.println("이메일 형식임");
//			}
//			else {
//				System.out.println("이메일 형식 아님");
//			}
//			
//		}
//		else {
//			System.out.println("이메일 형식 아님");
//		}
		/*
		시나리오]주민등록번호로 성별을 구분하는 프로그램을 indexOf()를
		이용해서 작성하시오.
		*/	
		System.out.print("주민번호 입력(-포함해서 입력): ");
		String q = scanner.nextLine();
		
		if(q.contains("-")) {
//			String[] y = q.split("-");
			int y = q.indexOf("-")+1;
//			String w =(q.substring(y,y)) ;
			if(q.charAt(y)%2==0) {
				System.out.println("여자");
			}
			else {
				System.out.println("남자");
			}
		}
		else {
			System.out.println("주민번호 형식 아님");
		}
		
//		if((int)(q.indexOf(8)%2)==0) {
//			System.out.println("여자");
//		}
//		else {
//			System.out.println("남자");
//		}
		
		/*
		시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		
		
	
		System.out.println("파일명 입력");
		String e = scanner.nextLine();
//		String o = e.lastIndexOf(".");
//		System.out.println(o[1]);
		if(e.contains(".")) {
			System.out.println(e.lastIndexOf("."));
			int i = e.lastIndexOf(".")+1;
			System.out.println(e.substring(i));
		}
		else {
			System.out.println("파일명 형식 아님");
		}
//		System.out.println(e.lastIndexOf("."));
//		int i = e.lastIndexOf(".");
//		System.out.println(e.substring(i));
		

	}

}
