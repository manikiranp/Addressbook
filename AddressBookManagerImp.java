package Phonebook;
import java.util.*;

public class AddressBookManagerImp implements AddressBookManagerInterface {
	static ArrayList<ArrayList<Person>> phonebooklist = new ArrayList<ArrayList<Person>>();
	@Override
	public void newAddressBook() {
		ArrayList<Person> addressbook = new ArrayList<Person>();
		Scanner n = new Scanner(System.in);
		System.out.println("Enter New addressbook name");
		String nam = n.nextLine();
		phonebooklist.add(addressbook);
	
	}

	@Override
	public void openAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAsAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

}
