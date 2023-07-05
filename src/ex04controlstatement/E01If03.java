package ex04controlstatement;

/*
if 문 형식3
	if(조건1){
		조건1이 참일때;
	}
	else if(조건2){
		조건2이 참일때;
	}
	else{
		위 조건이 모두 만족하지 않을때;
	}
	단, else문에는 조건식이 들어가면 에러가 발생된다
 */

public class E01If03 {

	public static void main(String[] args) {
		
		
		// 정수타입으로 점수를 설정
		int kor=99, eng=70, math=64;
		/* 평균값은 소수점이 나올 수 있으므로 실수형으로 선언하는
		것이 좋다. 따라서 double결과를 얻기위해 3.0으로 나눠준다 */
		double avg = (kor+eng+math) / 3.0;
		System.out.println("평균점수는(그대로): " +avg);
		// 서식문자를 이용해서 소수이하 2자리까지만 표현한다
		System.out.printf("평균점수는(소수2자리): %.2f\n", avg);
		
		// if~else if를 이용해서 여러개의 조건을 사용 가능
		if(avg>=90) {
			System.out.println("A학점");
		}
		else if(avg>=80) {
			System.out.println("B학점");			
		}
		else if(avg>=70) {
			// 결과는 77.67이므로 C학점 출력
			System.out.println("C학점");
		}
		else if(avg>=60) {
			System.out.println("D학점");
		}
		else {
			System.out.println("죽어라");
		}
		
		// System.out.println("잘못된 조건식의 if문");
	
	}

}
