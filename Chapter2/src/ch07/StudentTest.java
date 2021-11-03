package ch07;

public class StudentTest {


	public static void main(String[] args) {
		Student kim = new Student("choi", 100);
		Student choi = new Student("kim", 101);
		
		choi.setKoreanSubject("국어", 100);
		choi.setKoreanSubject("수학", 100);
		
		choi.koreanScore.score = 100;
		choi.mathScore.score = 100;
		
		choi.showStudentScore();
		kim.showStudentScore();
	}

}
