package ch01;

public class AnimalTest {

	public static void main(String[] args) {

		Person p1 = new Person("choi", "gangseo");
		Tiger t1 = new Tiger("tiger", "gangseo");
		
		p1.walk("�� ��");
		p1.dirve();
		p1.showInfo();
		
		t1.walk("�� ��");
		t1.hunt();
		t1.showInfo();
	}

}