package ex06array;

public class QuNumberCounter {

	public static void main(String[] args) {

		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
		int[] counter = new int[4];

		for(int i=0 ; i<answer.length ; i++) {
			if(answer[i]==1) {
				counter[0]++;
			}
			
			if(answer[i]==2) {
				counter[1]++;
			}
			
			if(answer[i]==3) {
				counter[2]++;
			}
			
			if(answer[i]==4) {
				counter[3]++;
			}
			
//			counter[answer[i]-1]++;
		}
		
		System.out.println("1의 갯수: " +counter[0]);
		System.out.println("2의 갯수: " +counter[1]);
		System.out.println("3의 갯수: " +counter[2]);
		System.out.println("4의 갯수: " +counter[3]);
	}

}
