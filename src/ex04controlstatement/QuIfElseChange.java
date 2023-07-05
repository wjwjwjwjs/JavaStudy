package ex04controlstatement;

public class QuIfElseChange {

	public static void main(String[] args) {

		int num1=50, num2=100;
		int big, diff;

		if(num1 > num2) {
			System.out.println(num1);
		}
		else if(num2 > num1) {
			System.out.println(num2);
		}
		System.out.println();
		
		if(num1 > num2) {
			System.out.println((num1-num2));
		}
		else if(num2 > num1) {
			System.out.println((num2-num1));
		}
		
	}

}
