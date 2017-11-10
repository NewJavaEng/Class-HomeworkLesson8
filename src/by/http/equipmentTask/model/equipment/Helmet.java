package by.http.equipmentTask.model.equipment;

public class Helmet extends Accessory {

	private String colour;

	public Helmet(String title, Category category, int size, int id, String colour) {
		super(title, category, size, id);
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public String toString() {
		return "Helmet title: " + getTitle() + ", category: " + getCategory() + ", size: " + getSize() + ", colour: "
				+ getColour() + ", helmet id: " + getId();
	}

}
