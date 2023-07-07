package ex06array;

public class QuArray1To10 {

	public static void main(String[] args) {

		int[] num10 = new int[10];
		int count = 0;
		
		for(int i=0; i<num10.length; i++) {
			System.out.print(" " +(num10[i] = i+1));
//			num10[i] = i+1;
			count += num10[i] ;
		}
		
		System.out.println("\n배열전체요소 합: "+ count);
		
	}

}
