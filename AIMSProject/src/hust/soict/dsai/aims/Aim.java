package hust.soict.dsai.aims;
//package src.AimsProject;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aim {
	public static void main(String[] args) {
		Cart anOrder = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
		"Animation", "Roger Allers", 87, 19.95f);
		anOrder.addMedia(dvd1) ;

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
		"Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addMedia(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
		"Animation", null, 0, 18.99f);
		anOrder.addMedia(dvd3) ;
		
		
		
		//print total cost of the items in the cart
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		anOrder.removeMedia(dvd3);
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
	}
}	