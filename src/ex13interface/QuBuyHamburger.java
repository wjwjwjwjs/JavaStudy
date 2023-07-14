package ex13interface;

class Burger {
	//멤버변수
	/* 버거명, 가격, 패티, 소스, 야체를 표현 */
	String name;
	private int price; 
	String pattie;
	String sourc;
	String vegta;
	
	public Burger(String name, int price, String pattie, String sourc, String vegta) {
		super();
		this.name = name;
		this.price = price;
		this.pattie = pattie;
		this.sourc = sourc;
		this.vegta = vegta;
	}
	
	public int getPrice(){
		return price;
	}
	
	public void showPrice(){
		System.out.println("버거명: "+ name);
		System.out.println("가격: "+ price);
		System.out.println("식재료: "+ name+ sourc+ vegta);
	}
	
	//인자생성자
	
	//getter : price만 필요
	
	//햄버거 정보 출력
	/* 버거명, 가격, 식재료 출력*/
}
//햄버거의 기본가격 추상화 
class HamburgerPrice {
	//멤버변수
	/* 햄버거종류, 음료, 프렌치프라이 */
	Burger burger;
	final int COKE = 1000;
	final int POTATO = 1500;
	
	public HamburgerPrice(String a, int b, String c, String d, String e) {
		burger = new Burger(a,b, c, d, e);
	}

	public HamburgerPrice(Burger burger1) {
		// TODO Auto-generated constructor stub
	}

	public int showPrice() {
		return burger.getPrice()+COKE+POTATO;
	}
	
	void Fprice() {
		System.out.println(showPrice());
	}
	
	//인자생성자

	//기본가격계산
	
	//햄버거와 결제금액 출력
}
//세트가격을 추상화(기본가격을 상속)
class SetPrice extends HamburgerPrice {

	public SetPrice(String a, int b, String c, String d, String e) {
		super(a, b, c, d, e);
		// TODO Auto-generated constructor stub
	}	
	//인자생성자
	
	//세트가격계산(오버라이딩)
	@Override
	public int showPrice() {
		return super.showPrice();
	}
	//햄버거와 세트결제금액 출력(오버라이딩)	
	@Override
	void Fprice() {
		// TODO Auto-generated method stub
		super.Fprice();
	}
}

public class QuBuyHamburger {

	public static void main(String[] args) {
		
		//치즈버거 객체 생성
		Burger burger1 = new Burger("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		//치킨버거 객체 생성
		Burger burger2 = new Burger("치킨버거", 3000, "닭고기패티", "마요네즈", "양상치");
		
		//치즈버거를 기본가격으로 구매
		HamburgerPrice price1 = new HamburgerPrice(burger1); 
		price1.showPrice();	// 4500원	
		
		//치킨버거를 세트가격으로 구매
		HamburgerPrice price2 = new SetPrice(burger2); 
		price2.showPrice();	// 5000원
	}
}
