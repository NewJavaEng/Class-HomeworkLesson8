package by.http.equipmentTask.model;

import by.http.equipmentTask.model.equipment.Equipment;

public class User {

	private String name;
	private int id;
	private RentUnit rentUnit;

	public User(String name, int id) {
		this.name = name;
		this.id = id;
		RentUnit rentEquip = new RentUnit();
	}

	public int showCount() {
		return rentUnit.getCount();

	}

	public Equipment getEquipment(int index) {
		return rentUnit.getEquiment(index);
	}

	public void addEquipment(Equipment equipment) {
		rentUnit.addEquipment(equipment);
	}

	public void removeEquipment() {

	}

	public void addAccessory() {

	}

	public void removeAccessory() {

	}

}
