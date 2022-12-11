package hust.soict.dsai.aims.media;

import java.util.List;

import javax.sound.midi.Track;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private int lengthOfTracks=0;
	private List<Track> tracks;
	public String getArtist() {
		return artist;
	}
	public CompactDisc(String title) {
		super(title);
	}
	
	public void addTrack(Track nameTrack) {
		tracks.add(nameTrack);
		lengthOfTracks++;
	}
	public void removeTrack(Track nameTrack) {
		tracks.remove(nameTrack);
		lengthOfTracks--;
	}
	public int getLength() {
		return lengthOfTracks;
	}
	public void play() {
	    for (Track track : tracks) {
	    	System.out.println("Artist: " + this.artist);
	    }
	}
}
