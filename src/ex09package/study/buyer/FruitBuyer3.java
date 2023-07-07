package ex09package.study.buyer;

import ex09package.study.seller.FruitsSeller4;

public class FruitBuyer3 {

	int myMoney;
	int numOfApple ;
	
	// 멤버변수의 초깃값을 제거한 후 초기화 메서드를 추가한다.
	public FruitBuyer3(int _myMoney, int _numOfApple) {
		myMoney = _myMoney ;
		numOfApple = _numOfApple;
	}

	public void buyApple(FruitsSeller4 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	// 구매자의 현재상태 출력
	public void showBuyResult() {
		System.out.println("[구매자] 현재 잔액: "+ myMoney);
		System.out.println("[구매자] 사과 갯수: "+ numOfApple);
	}
	
}
