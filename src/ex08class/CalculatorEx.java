package ex08class;

public class CalculatorEx {
		
	int count1 ;
	int count2 ;
	int count3 ;
	int count4 ;
	
	// 초기화 메서드
	void init() {
		count1 = 0;
		count2 = 0;
		count3 = 0;
		count4 = 0;
	}
	
	// 요건 안됨
//	void add(int a, int b) {
//		System.out.println((a+b));
//	}
	
	int add(int a, int b) {
		count1 ++ ;
		int c = a+b;
		return c;
	}
	
	double min(double a, double b) {
		count2 ++ ;
		double c = a-b;
		return c;
	}
	
	double mul(double a, double b) {
		count3 ++ ;
		double c = a*b;
		return c;
	}
	
	double div(double a, double b) {
		count4 ++ ;
		double c = a/b;
		return c;
	}
	
//	double min(double a, double b) {
//		double c = a+b;
//		return c;
//	}
	
	void showOpCount() {
//		System.out.println("덧셈횟수 : "+ count1);
//		System.out.println("뺄셈횟수 : "+ count2);
//		System.out.println("곱셈횟수 : "+ count3);
//		System.out.println("나눗셈횟수 : "+ count4);
		StringBuffer sb = new StringBuffer();
		sb.append("덧셈횟수: "+ count1);
		sb.append("\n뺄셈횟수: "+ count2);
		sb.append("\n곱셈횟수: "+ count3);
		sb.append("\n나눗셈횟수: "+ count4);
		System.out.println(sb);
	}
	
	
}
