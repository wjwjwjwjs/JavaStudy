package ex10accessModifier;


class FruitSeller5{
	
	int numOfApple;
	int myMoney;
	int APPlE_PRICE;
	
	public FruitSeller5(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPlE_PRICE = price;
	}
	
	public int saleApple(int money) {
		int num = money / APPlE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
		
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은 사고 갯수: "+ numOfApple);
		System.out.println("[판매자]판매 수익: "+ myMoney );
	}
	
}

class FruitBuyer5{
	
	int myMoney;
	int numOfApple ;
	
	public FruitBuyer5(int _myMoney, int _numOfApple) {
		myMoney = _myMoney ;
		numOfApple = _numOfApple;
	}

	public void buyApple(FruitSeller5 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자] 현재 잔액: "+ myMoney);
		System.out.println("[구매자] 사과 갯수: "+ numOfApple);
	}
	
}

public class E02FruitSalesMain5 {

	public static void main(String[] args) {

		FruitSeller5 seller1 = new FruitSeller5(0, 100, 1000);
		
		FruitSeller5 seller2 = new FruitSeller5(0, 80, 500);
		
		FruitBuyer5 buyer = new FruitBuyer5(10000, 0);
		
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();

		///////////////////////////////////
		
		/* 아래의 코드는 문법적으로는 오류가 없으나 지불금액과
		구매한 사과의 관계가 전혀 맞지 않는 논리적 오류가 발생되었다
		즉, 코드(메서드)로 구현한 규칙이 완전히 무너지게 된다
		객체지향 프로그래밍에서는 이런 오류를 막기위해 멤버변수에
		대한 "정보은닉"을 권장하고 있다
		멤버변수의 외부접근으 ㄹ원천적으로 차단하고, 멤버메서드를
		통해서만 접근하게 하여 프로그래밍의 논리적 오류를 차단하는
		역할을 한다. */
		seller1.myMoney += 1000; // 판매자 1에게 1000원 지불
		buyer.myMoney -= 1000; // 구매자의 금액 차감
		seller1.numOfApple -= 50; // 사과 50개를 구매한다.
		buyer.numOfApple += 50; // 구매자는 사과 50개가 증가한다.
		// 즉 1000원에 사고 50개 구매한 꼴이 됨 
		
		///////////////////////////////////
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult(); 
		seller2.showSaleResult(); 
		buyer.showBuyResult();
		
	}

}
