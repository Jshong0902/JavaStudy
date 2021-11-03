package ch10;

public class GasStation {

	String address;
	int gasAccount;
	int money;
	
	public GasStation(String address) {
		this.address = address;
		this.gasAccount = 10;
	}
	
	public int oiling(int liter) {
		this.gasAccount -= liter;
		this.money += 6000*liter;
		return 6000*liter;
	}
	
	public void showInfo() {
		System.out.println(address + "주유소의 남은 기름은 " + gasAccount + "이고, 수입은 " + money + "원 입니다");
	}
}