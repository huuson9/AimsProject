package AimsProject;

public class Cart {
	final static int MAXN = 20;
	private int qtyOrdered = 0;
	private DigitalVideoDisc[] itemOrdered = new DigitalVideoDisc[MAXN];
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAXN) {
			System.out.println("The cart is already full");
		}else {
			this.itemOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
		}
	}
	
	public void removeDigitalVideoDics(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++)
		{
			if (itemOrdered[i] == disc) {
				for (int j = i; j < qtyOrdered; j++)
					{
						itemOrdered[j] = itemOrdered[j+1];
					}
				qtyOrdered--;
				System.out.println("The disc has been remove");
			}
		}
		System.out.println("Nothing");
	}
	public float totalCost() {
		float total = 0;
		for(int i=0; i<qtyOrdered;i++) {
			total+=itemOrdered[i].cost;
		}
		return total;
	}
	
	public void SearchFullById(int id) {
		for(int i=0; i< qtyOrdered; i++) {
			if (itemOrdered[i].getId() == id) {
				System.out.println(itemOrdered[i].getTitle() + " " + itemOrdered[i].getCategory() + " " + itemOrdered[i].getLength()+" "+itemOrdered[i].getCost()+" " + itemOrdered[i].getDirector());   
			}
		}
	}
	
	public void SearchFullByTitle(String tmp) {
		for(int i=0; i< qtyOrdered; i++) {
			if (itemOrdered[i].getTitle().equalsIgnoreCase(tmp)) {
				System.out.println(itemOrdered[i].getTitle() + " " + itemOrdered[i].getCategory() + " " + itemOrdered[i].getLength()+" "+itemOrdered[i].getCost()+" " + itemOrdered[i].getDirector());   
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
		for(int i=0; i<= qtyOrdered; i++) {
			if (itemOrdered[i].getId() == id) {
				System.out.println(itemOrdered[i].getTitle());                                                           
			}
		}
	}
	
}
