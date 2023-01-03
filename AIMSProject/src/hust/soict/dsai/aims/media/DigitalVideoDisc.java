package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc implements Playable {
	private static int nbDigitalVideoDics=0;
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category,director,length,cost);
		nbDigitalVideoDics++;
	}
	
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
}

