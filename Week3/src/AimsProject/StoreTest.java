package AimsProject;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f);
	
		store.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 24.95f);
		store.addDigitalVideoDisc(dvd2);
		
		store.removeDigitalVideoDics(dvd2);
	//	DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
	//	"Animation", 18.99f);
	//	cart.addDigitalVideoDisc(dvd3);
	//	
		//Test the print method
//		cart.SearchFullById(2);
//		cart.SearchFullByTitle("The Lion King");
		//To-do: Test the search methods here
	}
}