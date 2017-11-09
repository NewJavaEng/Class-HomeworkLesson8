package by.http.equipmentTask.util;

import by.http.equipmentTask.model.equipment.Accessory;
import by.http.equipmentTask.model.equipment.Equipment;

public class Print {
	
	public static void print(String text) {
		System.out.println(text);
	}
	
	public static void print(Equipment [] equipList) {
		for (int i = 0; i < equipList.length; i++) {
			if (equipList[i] != null)
			System.out.println(equipList[i].toString());
		}
	}
	
	public static void printAccessory(Accessory [] accessoriesList) {
		for (int i = 0; i < accessoriesList.length; i++) {
			if (accessoriesList[i] != null)
			System.out.println(accessoriesList[i].toString());
		}
	}
}
