package ch13;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		library[0] = new Book("»ï±¹Áö1","Ä§Âø¸Ç");
		library[1] = new Book("»ï±¹Áö2","Ä§Âø¸Ç");
		library[2] = new Book("»ï±¹Áö3","Ä§Âø¸Ç");
		library[3] = new Book("»ï±¹Áö4","Ä§Âø¸Ç");
		library[4] = new Book("»ï±¹Áö5","Ä§Âø¸Ç");
				
		for(int i =0; i<library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
	}
}
