package ch12;

public class ContinueTest {

	public static void main(String[] args) {
		int sum=0, i;
		int count=1;
		
		for (i=1 ; i<=100 ; i++) {
			if (i%3!=0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
