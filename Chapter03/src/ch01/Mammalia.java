package ch01;

public class Mammalia {

	protected String name;
	protected String address;	
	
	public void walk(String leg) {
		System.out.println(name+"가 "+leg+"로 걷고 있습니다.");
	}
	
	public void showInfo() {
		System.out.println(name+"이 사는 곳은 "+address+"입니다.");
	}
}