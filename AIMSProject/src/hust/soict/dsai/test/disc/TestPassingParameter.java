package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
	public static void main(String[] argc) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungel");
		DigitalVideoDisc cindereDVD = new DigitalVideoDisc("Cinderella");
		swap(jungleDVD, cindereDVD);
		System.out.println("Jungel dvd title: " + jungleDVD.getTitle());
		System.out.println("Cinderella dvd title: " + cindereDVD.getTitle());
		changeTitle(jungleDVD, cindereDVD.getTitle());
		System.out.println("Jungle dvd title: "+ jungleDVD.getTitle());
		
	}

//	public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
//		String tmp = o1.getTitle();
//		o1.setTitle(o2.getTitle());				
//		o2.setTitle(tmp);
//	}
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2= tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}
