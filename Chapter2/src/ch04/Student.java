package ch04;

public class Student {
	int number;
	String name;
	int grade;
	
	public Student(int number, String name, int grade){
		this.number = number;
		this.name = name;
		this.grade = grade;
	}
	
	public void showStudentInfo() {
		System.out.println("�л��� �й���" + number + "�̰� �̸���" + name + "�̰� �г���" + grade + "�Դϴ�");
	}
}