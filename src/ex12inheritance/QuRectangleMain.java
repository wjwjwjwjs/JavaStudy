package ex12inheritance;

//직사각형을 표현한 클래스
class Rectangle
{
	private int a;
	private int b;
	
	Rectangle(int a, int b){
		this.a = a ;
		this.b = b;
	}
	
	// private멤버변수를 외부에서 반환받기 위한 getter선언
	// 밑 자식 class에서 override를 위한 getter
//	int geta () {
//		return a;
//	}
//	
//	int getb () {
//		return b;
//	}
	
	void showAreaInfo() {
		if(a==b) {
			System.out.println("정사각형: "+ a*b);
		}
		else {
			System.out.println("직사각형: "+ a*b);
		}
		 
	}
	
	
     	//블라블라
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
	
	/* 정사각형은 밑변과 높이의 길이가 같으므로 하나의 값으로
	두개의 길이 대체 가능 */
	
	// 멤버변수 : 여기서는 확장이 필요없다.
	
	// 생성자 : 하나의 값으로 2개를 초기화 한다.
	public Square(int c) {
		super(c, c);
//		this.c = c;
	}
	
	
	// 이렇게도 쓸 수 있다
	/* 부모클래스에서 private로 선언된 멤버변수 이므로 직접적인
	접근은 불가능하다. 따라서 getter를 통해 값을 얻어온 후 
	연산해야한다 */
//	@Override
//		void showAreaInfo() {
//			System.out.println("정사각형 면적:"+ geta()*getb());
//		}
	
	
	
	
//	void showAreaInfo(){
//		System.out.println("정사각형 : " + c*c);
//	}
	
     	//블라블라
} 
class QuRectangleMain {
	public static void main(String[] args) {
		
	       	Rectangle rec = new Rectangle(4, 3);
	       	rec.showAreaInfo();

     		Square sqr = new Square(7);
	       	sqr.showAreaInfo();
 	}
}

