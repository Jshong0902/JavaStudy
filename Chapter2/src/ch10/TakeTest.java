package ch10;

public class TakeTest {

	public static void main(String[] args) {

		Person yesterdayMrchoi = new Person("yesterdayMrchoi", 5000);
		Person todayMrchoi = new Person("todayMrchoi", 20000);
		
		Subway brown = new Subway(3);
		Bus bus7_2 = new Bus("7-2");
		Car mycar = new Car("mycar");
		GasStation suyeong = new GasStation("suyeong");
		
		yesterdayMrchoi.takeSubway(brown);
		yesterdayMrchoi.takeBus(bus7_2);
		
		todayMrchoi.takeCar(mycar, suyeong);
		
		yesterdayMrchoi.showInfo();
		todayMrchoi.showInfo();
		System.out.println("============================================");
		brown.showSubwayInfo();
		bus7_2.showBusInfo();
		suyeong.showInfo();
		
	}

}