package ex13interface.figure;

/* 인터페이스 혹은 클래스 하나당 하나의 자바파일을 
구성하는것을 권장한다. 그렇게 해야 모든 클래스를 public
으로 선언할 수 있어 재활용이 가능해진다. */
public interface IFigure {
	void area(String figureName);
}
