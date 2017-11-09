package by.http.equipmentTask.model.equipment;

public abstract class Equipment extends Assortment {

	private String colour;

	public Equipment(String title, Category category, int id, String colour) {
		super(title, category, id);
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

}
