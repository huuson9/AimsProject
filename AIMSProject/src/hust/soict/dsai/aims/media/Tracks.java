package hust.soict.dsai.aims.media;

public class Tracks implements Playable {
	private String title;
	private int length;
	public Tracks(String title, int length) {
		this.title=title;
		this.length=length;
	}
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
}
