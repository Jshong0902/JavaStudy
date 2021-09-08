package ch10;

public class SwitchTest {

	public static void main(String[] args) {
		//한 달이 며칠인지 알려주는 프로그램
		int month = 9;
		int day;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			System.out.println("입력월을 확인하세요");
		}
		
		System.out.println(day);

	}

}
