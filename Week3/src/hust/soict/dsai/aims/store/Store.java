package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
	final static int MAXN = 20;
	private int qtyOrdered = 0;
	private ArrayList<Media> itemOrdered = new ArrayList<>();
	
	public void addMedia(Media MediaName) {
		itemOrdered.add(MediaName);
		qtyOrdered++;
		System.out.println("The disc has been added");
	}
	public void removeMedia(Media MediaName) {
		itemOrdered.remove(MediaName);
		qtyOrdered--;
		System.out.println("The disc has been remove");
	}
}
