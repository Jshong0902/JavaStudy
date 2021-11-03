package ch02;

public class FuntionTest {
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	public static void sayHello(char name) {
		System.out.println(name + "¥‘, æ»≥Á«œººø‰.");
	}
	public static int calcSum() {
		int i, sum=0;
		for (i=0 ; i<=100 ; i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		int sum=0;
		int num1=10;
		int num2=20;
		
		sum = add(num1, num2);
		System.out.println(sum);
		
		
		sum = calcSum();
	}

}