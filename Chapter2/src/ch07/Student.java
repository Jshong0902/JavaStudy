package ch07;

public class Student {
	String name;
	int number;
	Subject korean;
	Subject mathScore;
	
	public Student(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public void setKoreanSubject(String name, int score) {
		korean.name = name;
		korean.score = score;
	}
	public void setMathnSubject(String name, int score) {
		korean.name = name;
		korean.score = score;
	}
	
	public void showStudentScore() {
		int sum = this.koreanScore.score + mathScore.score;
		System.out.println(name + "학생의 성적 합은 " + sum + "입니다.");
	}
}
