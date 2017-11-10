package by.http.equipmentTask.model.equipment;

public class KneePad extends Accessory {

	private String securityClass;

	public KneePad(String title, Category category, int size, int id, String securityClass) {
		super(title, category, id, size);
		this.securityClass = securityClass;
	}

	public String getSecurityClass() {
		return securityClass;
	}

	public String toString() {
		return "Knee pad title: " + getTitle() + ", category: " + getCategory() + ", size: " + getSize()
				+ ", security class: " + getSecurityClass() + ", knee pad id: " + getId();
	}

}
