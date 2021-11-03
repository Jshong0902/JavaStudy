package ch14;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1117, "Choi");
		
		studentLee.addSubject("OS", 100);
		studentLee.addSubject("수학", 100);
		
		Student studentKim = new Student(1217, "Kim");
		
		studentKim.addSubject("OS", 95);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 90);
		
		studentLee.showStudentInfo();
		System.out.println("======================================");
		studentKim.showStudentInfo();	
	}
}