package Phonebook;
import java.util.*;

public class AddressBookManagerImp implements AddressBookManagerInterface {
	static ArrayList<ArrayList<Person>> phonebooklist = new ArrayList<ArrayList<Person>>();
	
	Scanner n = new Scanner(System.in);

	public void newAddressBook() {

		System.out.println("Enter New addressbook name");
		String ne = n.nextLine();
		phonebooklist.add(ne);
	
	}


	public void openAddressBook() {
		//AddressBookImp();
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
