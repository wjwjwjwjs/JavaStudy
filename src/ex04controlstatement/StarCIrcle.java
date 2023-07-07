package ex04controlstatement;

public class StarCIrcle {

	public static void main(String[] args) {

		for(int i=1 ; i<=12 ; i++) {
			
			for(int j=1 ; j<=12; j++) {
				
				if(i+j<=5 && i<=6) {
					System.out.println(" ");
				}
				else if(i+j >= 10 && i<=6) {
					System.out.println(" ");
				}
				else if(true) {
					System.out.println(" ");
				}
				else if(true) {
					System.out.println(" ");
				}
				else {
					System.out.println("*");
				}
			}
			
		}
		
	}

}
