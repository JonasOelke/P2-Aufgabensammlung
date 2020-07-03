package fileIO;

import java.io.Serializable;

public class EX4_Buch implements Serializable{


		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String isbn;
		private String title;
		private String author;
		private int edition;
		private int year;
		
		public EX4_Buch(String isbn, String title, String author, int edition, int year) {
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
		
		public String toString() {
			return title + " von " + author;
		}
		
	

	
}
