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
		System.out.println(address + "�������� ���� �⸧�� " + gasAccount + "�̰�, ������ " + money + "�� �Դϴ�");
	}
}