package ch13;

public class ObjectCopy2 {
	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibaray = new Book[5];
		
		library[0] = new Book("�ﱹ��1","ħ����");
		library[1] = new Book("�ﱹ��2","ħ����");
		library[2] = new Book("�ﱹ��3","ħ����");
		library[3] = new Book("�ﱹ��4","ħ����");
		library[4] = new Book("�ﱹ��5","ħ����");
		
		copyLibaray[0] = new Book();
		copyLibaray[1] = new Book();
		copyLibaray[2] = new Book();
		copyLibaray[3] = new Book();
		copyLibaray[4] = new Book();
		
		for(int i = 0; i< library.length; i++) {
			copyLibaray[i].setTitle(library[i].getTitle());
			copyLibaray[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setTitle("�����");
		library[0].setAuthor("�������丮");
	
		System.out.println("======library=========");
		for( Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("======copy library=========");
		for( Book book : copyLibaray) {
			book.showBookInfo();
		}
	}
}