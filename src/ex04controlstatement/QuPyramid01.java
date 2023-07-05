package ex04controlstatement;

public class QuPyramid01 {

	public static void main(String[] args) {

		int i = 1;
		while(i<=5) {
			
			int j = 1;
			while(j<=5) {
				
				if(j<=i) {
					System.out.print("*");
				}
				
				j++;
			}
			System.out.println();
			
			i++;
		}
		
		System.out.println("\n==========\n");
		
		
		int n = 1;
		do {
			
			int m = 1;
			do {
				if(m+n<=6) {
					System.out.print("*");
				}
				m++;
			}while(m<=5);
			
			System.out.println();
			n++;
		}while(n<=5);
		
		
		
		System.out.println("\n==========\n");
		
		for(int x=1 ; x<=5 ; x++) {
			
			for(int y=1 ; y<=9 ; y++) {
				if(x+y<=5) {
					System.out.print(" ");
				}
				else if(x+5 <= y) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("\n==========\n");
		
		for(int q=1 ; q<=9 ; q++) {
			
			for(int p=1 ; p <= 5; p++) {
				
				if(q >= p && q<=5) {
					System.out.print("*");
				}
				if(p<=10-q && q>=6) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
