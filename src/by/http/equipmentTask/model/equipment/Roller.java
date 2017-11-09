package by.http.equipmentTask.model.equipment;

public class Roller extends Equipment {

	private int wheelAmount;

	public Roller(String title, Category category, 	int id, String colour, int wheelAmount) {
		super(title, category, id, colour);
		this.wheelAmount = wheelAmount;
	}
	
	
	public int getWheelAmount() {
		return wheelAmount;
	}



	@Override
	public String toString() {
		return "Roller Title: " + getTitle() + ", category: " + getCategory()+ ", wheel amount: " + getWheelAmount() + ", colour: " + getColour()+ ", roller id: " + getId();
	}

}
