package ejercicios;

public class Student {

	public String name;
	public String gender;
	private String cui;
	private int age;

	public Student() {

	}

	public Student(String pName, String pGender, String pCui, int pAge) {
		name = pName;
		gender = pGender;
		cui = pCui;
		age = pAge;
	}

	public Student(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getCui() {
		return cui;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setGender(String gender) {
		 this.gender=gender;
	}
	public void getCui(String cui) {
		 this.cui=cui;
	}
	public void getAge(int age) {
		this.age=age;
	}
}
