package ex09package;

import ex09package.study.buyer.FruitBuyer3;
import ex09package.study.seller.FruitsSeller4;

public class E03FruitSalesMain4 {
	public static void main(String[] args) {

		/*
		생성자를 사용해서 인스턴스를 생성하면 생성과 동시에
		초기화할 수 있으므로 초기화 메서드를 사용하는것보다 
		적은 코드로 작성할 수 있다.
		 */
		// 판매자1 : 사과 100개, 단가 1000원으로 정의
		
		
		
		FruitsSeller4 seller1 = new FruitsSeller4(0, 100, 1000);
		
		// 판매자2 : 사과 80개, 단가 500원으로 정의
		FruitsSeller4 seller2 = new FruitsSeller4(0, 80, 500);
		
		// 구매자 : 보유금액 10000원, 사과 0개
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);
		
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		// 구매자가 각각의 판매자에게 5000원을 지불하고 사과를 구매한다.
		buyer.buyApple(seller1, 5000); 
		buyer.buyApple(seller2, 5000); 
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult(); // 5개 판매
		seller2.showSaleResult(); // 10개 판매
		// 10000원을 내고 15개 구매
		buyer.showBuyResult();
		
	}

}
