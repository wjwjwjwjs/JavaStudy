package ex12inheritance;

public class AnimalDog extends Animal {
	
	String dogkind;
	String name;

	public AnimalDog(String species, int age, String gender, String dogkind, String name) {
		
		super(species, age, gender);
		this.dogkind = dogkind;
		this.name = name;
		
	}
	
	public void bark() {
		
		System.out.println("이름이 " + name + "이고 종이" + dogkind +"인 강아지가 짖는다.");
	}
	
	public void showDog() {
		showAnimal();
		System.out.println("종: "+ dogkind);
		System.out.println("이름: "+ name);
	}
	
	public void AnimalDog1(String species, int age, String gender, String dogkind, String name) {
//		AnimalDog ad = new AnimalDog(species,age, gender,dogkind, name);
		setSpecies(species);
		setGender(gender);
		setAge(age);
		this.dogkind= dogkind;
		this.name = name;
	}
	
}
