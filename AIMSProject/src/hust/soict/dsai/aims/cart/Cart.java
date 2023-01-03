package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Cart {
//	final static int MAXN = 20;
	private int qtyOrdered = 0;
	private ArrayList<Media> itemOrdered = new ArrayList<>();
	public float totalCost() {
		float total = 0;
		for(Media media : itemOrdered) {
			total+=media.getCost();
		}
		return total;
	}
	public void addMedia(Media MediaName) {
		itemOrdered.add(MediaName);
		qtyOrdered++;
	}
	public void removeMedia(Media MediaName) {
		itemOrdered.remove(MediaName);
		qtyOrdered--;
	}
	
	public void SearchFullById(int id) {
		for(Media media : itemOrdered) {
			if (media.getId() == id) {
//				System.out.println(media.getTitle() + " " + media.getCategory() + " " + media.getLength()+" "+itemOrdered[i].getCost()+" " + itemOrdered[i].getDirector());   
				System.out.println(media.getTitle() + " " + media.getCategory());
			}
			
		}
	}
	
	public void SearchFullByTitle(String tmp) {
		for(Media media : itemOrdered) {
			if (media.getTitle().equalsIgnoreCase(tmp)) {
//				System.out.println(itemOrdered[i].getTitle() + " " + itemOrdered[i].getCategory() + " " + itemOrdered[i].getLength()+" "+itemOrdered[i].getCost()+" " + itemOrdered[i].getDirector());   
				System.out.println(media.getTitle() + " " + media.getCategory());
			}
		}
	}
//	public void SearchFullById(int id) {
//		int i;
//		for (i = 0; i < qtyOrdered; i++) {
//			if (itemOrdered[i].getId() == id) {
//				System.out.println("The DVD: ");
//				System.out.printf("[Id: %d] - [Title: %s] - [Category: %s] - [Director: %s] - [Leagth: %d] - [Price: $f $]\n", itemOrdered[i].getId(), itemOrdered[i].getTitle(), itemOrdered[i].getCategory(), itemOrdered[i].getDirector(), itemOrdered[i].getLength(), itemOrdered[i].getCost());
//				break;
//			}
//		}
//		if (i == MAXN) {
//			System.out.println("The DVD is not found");
//		}
//	}
	
	public void SearchTitleById(int id) {
		for(Media media : itemOrdered) {
			if (media.getId() == id) {
				System.out.println(media.getTitle());                                                           
			}
		}
	}
	
}