package ex13interface.figure;

/* 가로(밑변), 세로(높이)를 멤버로 가지고있는 클래스로 차후
삼각형, 사각형 클래스에서 상속하여 사용한다. */
public class FigureData {

	// 멤버변수와 생성자 정의
	int width, height;

	public FigureData(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	
}
