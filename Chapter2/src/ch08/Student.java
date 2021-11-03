package ch08;

public class Student {
	private int number;
	private String name;
	private int grade;
	
	public Student(int number, String name, int grade){
		this.number = number;
		this.name = name;
		this.grade = grade;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println("�л��� �й���" + number + "�̰� �̸���" + name + "�̰� �г���" + grade + "�Դϴ�");
	}
	public String getName() {
		return this.name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}