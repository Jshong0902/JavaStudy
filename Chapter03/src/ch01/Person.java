package ch01;

public class Person extends Mammalia{

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void dirve() {
		System.out.println(name+"���� ������ �մϴ�.");
	}
}