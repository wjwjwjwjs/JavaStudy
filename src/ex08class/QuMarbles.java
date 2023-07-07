package ex08class;

class ChildProperty {
	
	int a;
//	String s;
	
	ChildProperty(int a){
		this.a = a;
	}
	
	
//	int init(String s, int a) {
//		this.s = s;
//		this.a = a ;
//		return a;
//	}
	
	void showProperty() {
		System.out.println(a);
	}


	int obtainBead(ChildProperty c, int i) {
			  
		int q= this.a+i;
//		this.a += i ;
		c = new ChildProperty(q);
//		c.showProperty();
//		c.ch
		
		
		
		return q;

	}
	
	

	
	
}

public class QuMarbles {

	public static void main(String[] args) {

		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 

		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();

		
	}

}
