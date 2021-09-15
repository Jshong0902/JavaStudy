package ch01;

public class IronMan {
	
	private String markName;
	public IronMan(String markName) {
		this.markName = markName;
		
	}
	
	public void fly() {
		System.out.println(markName + "아이언맨이 날아다닙니다.");
	}
}