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
		System.out.println("키가 " + heigh + "이고 몸무게는 " + weigh + "kg인 남성이 있습니다. 이름은 " + name + "이고 나이는 " + age + "세 입니다.");
	}
}