package hust.soict.dsai.aims.media;

import java.util.Comparator;

import hust.soict.dsai.aims.cart.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.cart.MediaComparatorByTitleCost;

public class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST=new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE=new MediaComparatorByCostTitle();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Media(String title) {
		this.title=title;
	}
	public Media(String title, String category, float cost) {
		this.title=title;
		this.category=category;
		this.cost=cost;
	}
	public boolean isMatch(String title) {
        return this.title.equals(title);
    }

    public boolean isMatch(int id) {
        return (this.id == id);
    }

    @Override
    public boolean equals(Object obj) {
        return this.title.equals(((Media)obj).getTitle());
    }
		
}