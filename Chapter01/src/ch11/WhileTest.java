package ch11;

public class WhileTest {

	public static void main(String[] args) {
		int count=1, sum=0;
		while(count <= 10) {
			sum+=count++;
		}
		System.out.println(sum);
		System.out.println(count);

	}

}
