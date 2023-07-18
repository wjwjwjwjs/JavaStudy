package quiz;

import java.io.IOException;

interface i1{
	int a = 10;
	int b = 10;
}


public class ssssss {
	

	public static void main(String[] args) {
		
		int i=0;
		int j=0;
		int k = (int)(Math.random()*i1.a+1);
		int t = (int)(Math.random()*i1.b+1);
		System.out.println(k +" "+ t);
		
		for(i=0; i<=i1.a ; i++) {
			for(j=0; j<=i1.b ; j++) {
				
				if((i==0 || i==i1.a)||(j==0 || j==i1.b)) {
					System.out.print("□ ");
				}
				else if(i==k && j==t) {
					System.out.print("□ ");
				}
				else {
					System.out.print("■ ");
				}
			}
			System.out.println();	
		}
		
		int p = 0;
		try {
			p = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		if(p==77) {
//			k++;
//		}
		
	}

}
