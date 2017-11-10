package by.http.equipmentTask.model;

import by.http.equipmentTask.model.equipment.Accessory;
import by.http.equipmentTask.model.equipment.Equipment;

public class RentUnit {

	private final Equipment[] equipments = new Equipment[3];
	private Accessory[] accessories;
	private int count = 0;

	//getter
	public int getCount() {
		return count;
	}
	
	public void addEquipment(Equipment equipment) {
		if (count < 3) {
			equipments[count] = equipment;
			count++;
		}
	}

	public Equipment getEquiment(int index) {
		if (index >= 0 && index <= 2) {
			return equipments[index];
		} else {
			return null;
		}
	}

}
