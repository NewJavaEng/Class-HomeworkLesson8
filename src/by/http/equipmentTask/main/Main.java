package by.http.equipmentTask.main;

import java.util.Scanner;

import by.http.equipmentTask.model.RentStation;
import by.http.equipmentTask.model.equipment.Accessory;
import by.http.equipmentTask.model.equipment.Category;
import by.http.equipmentTask.model.equipment.Cycle;
import by.http.equipmentTask.model.equipment.Equipment;
import by.http.equipmentTask.model.equipment.Helmet;
import by.http.equipmentTask.model.equipment.KneePad;
import by.http.equipmentTask.model.equipment.Roller;
import by.http.equipmentTask.util.Print;

public class Main {

	public static void main(String[] args) {
		Equipment cycle1 = new Cycle("cycle 1", Category.SUMMER, 1, "red", 60);
		Equipment cycle2 = new Cycle("cycle 2", Category.WINTER, 2, "green", 63);
		Equipment cycle3 = new Cycle("cycle 3", Category.SUMMER, 3, "red", 68);
		Equipment cycle4 = new Cycle("cycle 4", Category.SUMMER, 4, "blue", 69);
		Equipment cycle5 = new Cycle("cycle 5", Category.SUMMER, 5, "red", 70);
		Equipment cycle6 = new Cycle("cycle 6", Category.SUMMER, 6, "yellow", 70);
		Equipment cycle7 = new Cycle("cycle 7", Category.SUMMER, 7, "red", 75);
		Equipment cycle8 = new Cycle("cycle 8", Category.WINTER, 8, "purple", 90);
		Equipment roller1 = new Roller("roller 1", Category.WINTER, 9, "blue", 6);
		Equipment roller2 = new Roller("roller 2", Category.SUMMER, 10, "red", 8);
		Equipment roller3 = new Roller("roller 3", Category.SUMMER, 11, "green", 10);
		RentStation st1 = new RentStation();
		st1.add(cycle1);
		st1.add(cycle2);
		st1.add(cycle3);
		st1.add(cycle4);
		st1.add(cycle5);
		st1.add(cycle6);
		st1.add(cycle7);
		st1.add(cycle8);
		st1.add(roller1);
		st1.add(roller2);
		st1.add(roller3);
		System.out.println("This is the list of equipment and accessories that our company offers you to rent:");
		Print.print(st1.getEquipList());

		Accessory helmet1 = new Helmet("helmet 1", Category.WINTER, 12, 6, "blue");
		Accessory helmet2 = new Helmet("helmet 2", Category.SUMMER, 13, 8, "red");
		Accessory helmet3 = new Helmet("helmet 3", Category.SUMMER, 14, 10, "green");
		Accessory kneepad1 = new KneePad("knee pad 1", Category.SUMMER, 9, 15, "first");
		Accessory kneepad2 = new KneePad("knee pad 2", Category.WINTER, 11, 16, "second");
		Accessory kneepad3 = new KneePad("knee pad 3", Category.WINTER, 13, 17, "third");
		RentStation ac1 = new RentStation();
		ac1.addAccessory(helmet1);
		ac1.addAccessory(helmet2);
		ac1.addAccessory(helmet3);
		ac1.addAccessory(kneepad1);
		ac1.addAccessory(kneepad2);
		ac1.addAccessory(kneepad3);
		Print.printAccessory(ac1.getAccessoriesList());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please make your choise and enter id of selected item: ");
		int idNumber = sc.nextInt();
		sc.close();

		System.out.println();

	}

}
