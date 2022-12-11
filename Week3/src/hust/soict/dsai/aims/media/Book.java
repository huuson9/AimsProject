package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	public Book(String title) {
		super(title);
	}
	private List<String> authors;
	public void addAuthor(String authorName) {
		authors.add(authorName);
		System.out.print("Author have been added");
	}
	public void removeAuthor(String authorName) {
		authors.remove(authorName);
		System.out.print("Author have been removed");
	}
	
}
