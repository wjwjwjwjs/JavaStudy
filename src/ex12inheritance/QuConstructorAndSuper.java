package ex12inheritance;

/* 상속관계가 있는 클래스에서 자식 클래스를 통해 인스턴스를 
생성할때에는 반드시 부모클래스의 인스턴스를 먼저 생성해야 한다.
이때 super()를 사용해서 부모의 생성자를 호출한다. */
class Car
{
       	int gasoline;
}
class HybridCar extends Car
{
       	int electric;
}
class HybridWaterCar extends HybridCar
{
       	int water;
       	
       	
       	// 부모클래스 2개의 인수를 전달하고, 1개는 멤버변수를 초기화한다
       	HybridWaterCar(int a, int b, int c){
       		
       		super.gasoline = a;
       		super.electric = b;
       		water = c;
       	}
 
       	public void showNowGauge()
       	{
                 	System.out.println("남은가솔린:"+gasoline);
                 	System.out.println("남은전기량:"+electric);
                 	System.out.println("남은워터량:"+water);
       	}
}
public class QuConstructorAndSuper {

	public static void main(String[] args)
	{
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();
	}
}
