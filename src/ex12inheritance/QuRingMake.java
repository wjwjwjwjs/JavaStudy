package ex12inheritance;

class Point {
	
	// 멤버변수 : 중심점 표현을 위해 x,y좌표값을 설정
   	int xDot, yDot;
   	
   	// 생성자
   	public Point(int x, int y) {
         		xDot=x;
         		yDot=y;
   	}
   	
   	// 멤버변수인 좌표값을 출력
   	public void showPointInfo() {
         		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}
//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	int radian;//반지름
	Point center;
	
	// 생성자
	public Circle(int a, int b, int c) {
		
		// Point 인스턴스를 생성 및 초기화
		center = new Point(a,b);
		// 멤버변수 반지름 초기화
		radian = c;
	}
	
	
	//블라블라
//	center = new Point()
}
//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	//블라블라
	
	
	
	// 생성자
	public Ring(int i, int j, int k, int l, int m, int n) {
		
		// 안쪽 원 인스턴스 형성
		innerCircle = new Circle(i,j,k);
		// 바깥쪽 원 인스턴스 형성
		outerCircle = new Circle(l,m,n);
		
//		innerCircle.center.xDot = i;
//		innerCircle.center.yDot = j;
//		innerCircle.radian = k;  
//		
//		
//		
//		outerCircle.center.xDot = l;
//		outerCircle.center.yDot = m;
//		outerCircle.radian = n;
	}
	
	
	// 링 청보출려하는 매서드
	void showRingInfo() {
		System.out.println("안쪽원의 정보: \n반지름: " + innerCircle.radian);
		innerCircle.center.showPointInfo();
		
		System.out.println("바깥쪽원의 정보: \n반지름: " + outerCircle.radian);
		outerCircle.center.showPointInfo();
	}

	
	
	
}
class QuRingMake {
	public static void main(String[] args) {
		
		
		/*
		 출력결과]
			안쪽원의 정보 :
			반지름 : 3	
			[x좌표:1, y좌표1]
			바깥쪽원의 정보 :
			반지름 : 9
			[x좌표:2, y좌표2]
		 */
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}
}

