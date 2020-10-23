package Phonebook;
import java.util.Scanner;

public class AddressBook  {

public static void main(String[] args) {
	int cond=1;
	Scanner input = new Scanner(System.in);
	while (cond == 1) {
		AddressBookManagerImplementation addressbookmanager = new AddressBookManagerImplementation();
		System.out.println("Address Book:"
				+ "1) Create new Addressbook"
				+ "2) Open Addressbook"
				+ "3) Save Addressbook"
				+ "4) Saveas Addressbook"
				+ "5) Close Addressbook"
				+ "6) Quit");
		System.out.println("Select an option: ");
		int num = input.nextInt();
		switch (num) {
		case 1:
			addressbookmanager.newAddressBook();
			break;
		case 2:
			addressbookmanager.openAddressBook();
			break;
		case 3:
			addressbookmanager.saveAddressBook();
			break;
		case 4:
			addressbookmanager.saveAsAddressBook();
			break;
		case 5:
			addressbookmanager.closeAddressBook();
			break;
		case 6:
			cond=0;
			break;
		default:
			System.out.println("Incorrect Choice");
		}
	}
}
}
