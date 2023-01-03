package hust.soict.dsai.aims.media;

public class Disc extends Media  {
	public int length;
	public String director;
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	public Disc(String title) {
		super(title);
	}
	public Disc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	
}
