package ex06array;

public class E07ForEachObject {

	public static void main(String[] args) {

		String[] strArr = new String[] {
				"자바는 재밌다",
				"자바는 유용함",
				"자바는 어렵다"
		};
		
		for(String e : strArr) {
			System.out.println(e);
		}
		
	}

}
