package ch10;

public class ifelseifelse {

	public static void main(String[] args) {
		int age = 10;
		int charge;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}
		else if (age < 14) {
			charge = 1500;
			System.out.println("초등학생입니다.");
		}
		else if (age < 20) {
			charge = 2000;
			System.out.println("중 고딩입니다.");
		}
		else {
			charge = 3000;
			System.out.println("성인입니다.");
		}
		System.out.println("요금은 : " + charge);
	}

}
