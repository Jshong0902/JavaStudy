package ch10;

public class Subway {
	int number;
	int passengerCount;
	int money;

	public Subway(int number) {
		this.number = number;
	}
	
	public void take(int money) {
		this.money = money;
		this.passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(number + "번 지하철의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
	}
}