package Phonebook;
import java.util.Scanner;

public class AddressBook  {

public static void main(String[] args) {
	int cond=1;
	
	while (cond == 1) {
		AddressBookManagerImp addressbookmanager = new AddressBookManagerImp();
		System.out.println("Address Book:\n"
				+ "1) Create new Addressbook\n"
				+ "2) Open Addressbook\n"
				+ "3) Save Addressbook\n"
				+ "4) Saveas Addressbook\n"
				+ "5) Close Addressbook\n"
				+ "6) Quit");
		System.out.println("Select an option: ");
		Scanner input = new Scanner(System.in);
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
