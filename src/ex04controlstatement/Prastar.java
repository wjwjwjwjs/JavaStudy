package ex04controlstatement;

public class Prastar {

	public static void main(String[] args) {

		for(int i=1 ; i <= 5 ; i++) {
			
			for (int j=1 ; j<=9; j++) {
				if(j>=i-1) {
					System.out.print(" ");
				}
				else if(11-j >= i) {
					System.out.print(" ");
				}
				else {
					System.out.println("*");
				}
			}
			System.out.println();
		}
		
	}

}
