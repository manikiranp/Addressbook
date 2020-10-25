package Phonebook;
import java.util.*;
import java.io.File;
import java.io.IOException;


public class AddressBookManagerImp implements AddressBookManagerInterface {
	ArrayList<Person> addressbook;
	//static ArrayList<ArrayList<Person>> phonebooklist = new ArrayList<ArrayList<Person>>();
	public AddressBookManagerImp( ) {
		addressbook = new ArrayList<Person>();
	}
	Scanner n = new Scanner(System.in);

	public void newAddressBook() {
		System.out.println("Enter new addressbook name:");
		String nam = n.nextLine();
		try {
			File obj = new File("D:\\Other\\"+nam + ".csv");
			if (obj.createNewFile()) {
				System.out.println("New Addressbook created: " + obj.getName()); 
				} else {
				System.out.println("Addressbook already exists."); 
				}
		}	catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
				}
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
