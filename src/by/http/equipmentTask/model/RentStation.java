package by.http.equipmentTask.model;

import by.http.equipmentTask.model.equipment.Accessory;
import by.http.equipmentTask.model.equipment.Equipment;

public class RentStation {

	private Equipment[] equipList;
	private Accessory[] accessoriesList;
	private int initSize = 6;
	private int equipSize = 0;
	private int accessSize = 0;

	// constructor
	public RentStation() {
		equipList = new Equipment[initSize];
		accessoriesList = new Accessory[initSize];
	}

	public void add(Equipment equip) {
		if (equipSize == equipList.length) {
			sizeIncrease();
		}
		if (equip != null) {
			equipList[equipSize] = equip;
			equipSize++;
		}
	}

	public Equipment[] getEquipList() {
		return equipList;
	}

	private void sizeIncrease() {
		int newSize = equipList.length * 3 / 2 + 1;
		Equipment[] temp = new Equipment[newSize];
		for (int i = 0; i < equipList.length; i++) {
			temp[i] = equipList[i];
		}
		equipList = temp;
	}

	public void addAccessory(Accessory accessory) {
		if (accessSize == accessoriesList.length) {
			sizeIncrease();
		}
		if (accessory != null) {
			accessoriesList[accessSize] = accessory;
			accessSize++;
		}
	}

	public Accessory[] getAccessoriesList() {
		return accessoriesList;
	}

	public void sizeIncreaseAccess() {
		int newSize = accessoriesList.length * 3 / 2 + 1;
		Accessory[] temp = new Accessory[newSize];
		for (int i = 0; i < accessoriesList.length; i++) {
			temp[i] = accessoriesList[i];
		}
		accessoriesList = temp;
	}

}
