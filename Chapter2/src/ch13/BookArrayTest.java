package ch13;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		library[0] = new Book("�ﱹ��1","ħ����");
		library[1] = new Book("�ﱹ��2","ħ����");
		library[2] = new Book("�ﱹ��3","ħ����");
		library[3] = new Book("�ﱹ��4","ħ����");
		library[4] = new Book("�ﱹ��5","ħ����");
				
		for(int i =0; i<library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
	}
}
