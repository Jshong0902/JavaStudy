package ch05;

public class Person {
	int heigh;
	int weigh;
	String gender;
	String name;
	int age;
	
	public Person(int heigh, int weigh, String gender, String name, int age) {
		this.heigh = heigh;
		this.weigh = weigh;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	public void infoPrint() {
		System.out.println("Ű�� " + heigh + "�̰� �����Դ� " + weigh + "kg�� ������ �ֽ��ϴ�. �̸��� " + name + "�̰� ���̴� " + age + "�� �Դϴ�.");
	}
}