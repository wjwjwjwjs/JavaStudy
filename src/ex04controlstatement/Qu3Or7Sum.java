package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {

		int i = 1;
		int add1 = 0;
		int add2 = 0;
		while(i<=100) {
			
			
			if(i%3==0 || i%7==0 ) {
				add1 += i ;
			}
			if(i%3==0 && i%7 ==0) {
				add2 += i;
			}
			
			i++;
			
		}
		System.out.println((add1-add2));
	
		
	}

}
