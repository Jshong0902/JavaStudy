package ch12;

public class CompanyTest {

	public static void main(String[] args) {
		//회사는 하나여야 한다
		Company naver = Company.getInstance();
		Company kakao = Company.getInstance();
		
		System.out.println(naver);
		System.out.println(kakao);
	}

}