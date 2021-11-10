package ch01;

public class Tiger extends Mammalia{

	public Tiger(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void hunt() {
		System.out.println(name+"이 사냥을 시작합니다.");
	}
}