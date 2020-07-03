package datenstrukturen;

public class EX1_Buch {
	private String isbn;
	private String title;
	private String author;
	private int edition;
	private int year;
	
	public EX1_Buch(String isbn, String title, String author, int edition, int year) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.year = year;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getEdition() {
		return edition;
	}

	public int getYear() {
		return year;
	}
	
	
	

}
