package quiz;

public class QuUpgradeGuGu {

	public static void main(String[] args) {

		for(int i=2; i<=9 ; i++) {
			
			for(int j=1 ; j<=9 ; j++) {
				if(j==1) {
					System.out.println(i+ "x" +j+ "="+ (i*j)+"\n");
				}
				else {
					for(int n=2; n<=j; n++) {
						System.out.print(i+"x" );
					}
					System.out.println(i+"="+ (int)Math.pow(i, j));
					System.out.println();
				}
			}
		}
		
	}

}
