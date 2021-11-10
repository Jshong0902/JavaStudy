package ch01;

public class AnimalTest {

	public static void main(String[] args) {

		Person p1 = new Person("choi", "gangseo");
		Tiger t1 = new Tiger("tiger", "gangseo");
		
		p1.walk("두 발");
		p1.dirve();
		p1.showInfo();
		
		t1.walk("네 발");
		t1.hunt();
		t1.showInfo();
	}

}