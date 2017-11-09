package by.http.equipmentTask.model.equipment;

public abstract class Accessory extends Assortment{
	
	private int size;
	
	public Accessory(String title, Category category, int id, int size) {
		super(title, category, id);
		this.size = size;
	}

	public int getSize() {
		return size;
	}
	
	

}
