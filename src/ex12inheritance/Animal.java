package ex12inheritance;

public class Animal {

	private String species;
	private int age;
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	private String gender;
	
	public Animal(String species, int age, String gender) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	}
	
	public void showAnimal() {
		System.out.println("종류: "+ species);
		System.out.println("나이: "+ age);
		System.out.println("성별: "+ gender);
	}
	
}
