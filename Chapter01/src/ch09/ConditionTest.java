package ch09;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		System.out.println("입력 받은 두 수 중 큰 수를 출력합니다.");
		
		int max;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력1 : ");
		int x = scanner.nextInt();
		
		System.out.println("입력2 : ");
		int y = scanner.nextInt();
		
		max = (x > y)?(x):(y);
		System.out.println(max);
	}

}
