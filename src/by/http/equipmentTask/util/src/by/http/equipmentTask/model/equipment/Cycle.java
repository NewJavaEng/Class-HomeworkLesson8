package by.http.equipmentTask.model.equipment;

public class Cycle extends Equipment{
	
	private int height;

	public Cycle(String title, Category category, int id, String colour, int height) {
		super(title, category, id, colour);
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "Cycle Title: " + getTitle() + ", category: " + getCategory()+ ", height: " + getHeight() + ", colour: " + getColour()+ ", cycle id: " + getId();
	}
	
	
	
	

}
