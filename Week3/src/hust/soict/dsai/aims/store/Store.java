package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	final static int MAXN = 20;
	private int qtyOrdered = 0;
	private DigitalVideoDisc[] itemInStore = new DigitalVideoDisc[MAXN];
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAXN) {
			System.out.println("The cart is already full");
		}else {
			this.itemInStore[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
		}
	}
	
	
	public void removeDigitalVideoDics(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++)
		{
			if (itemInStore[i] == disc) {
				for (int j = i; j < qtyOrdered; j++)
					{
						itemInStore[j] = itemInStore[j+1];
					}
				qtyOrdered--;
				System.out.println("The disc has been remove");
			}
		}
		System.out.println("Nothing");
	}
}
