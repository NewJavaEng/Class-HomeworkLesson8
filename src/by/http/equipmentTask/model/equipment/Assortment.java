package by.http.equipmentTask.model.equipment;

public abstract class Assortment {
	
	private String title;
	private Category category;
	private int id;
	
	public Assortment(String title, Category category, int id) {
		this.title = title;
		this.category = category;
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public Category getCategory() {
		return category;
	}
	
	public int getId() {
		return id;
	}

}
