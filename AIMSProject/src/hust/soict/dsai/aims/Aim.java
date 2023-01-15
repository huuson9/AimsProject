package hust.soict.dsai.aims;
//package src.AimsProject;
import javafx.collections.FXCollections;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.Store;

public class Aim {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		Store ordered = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
		"Animation", "Roger Allers", 87, 19.95f);
		anOrder.addMedia(dvd1) ;

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
		"Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addMedia(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
		"Animation", null, 0, 18.99f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladin",
				"Animatin", null, 0, 18.99f);
		ordered.addMedia(dvd3) ;
		ordered.addMedia(dvd1);
		ordered.addMedia(dvd2);
		ordered.addMedia(dvd4);
//		getItemOrdered()
		new StoreScreen(ordered);		
		
		//print total cost of the items in the cart
//		System.out.println("Total Cost is: ");
//		System.out.println(anOrder.totalCost());
//		anOrder.removeMedia(dvd3);
//		System.out.println("Total Cost is: ");
//		System.out.println(anOrder.totalCost());
		
	}
}	