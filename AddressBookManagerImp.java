package Phonebook;
import java.util.*;

import javax.sound.sampled.Line;

import java.io.*;
import java.io.BufferedReader;


public class AddressBookManagerImp implements AddressBookManagerInterface {
	
	ArrayList<Person> addressbook;
	static ArrayList<ArrayList<Person>> phonebooklist = new ArrayList<ArrayList<Person>>();
	public AddressBookManagerImp( ) {
	
	}
	Scanner n = new Scanner(System.in);

	public void newAddressBook() {
		System.out.println("Enter new addressbook name:");
		String nam = n.nextLine();
		try {
			File obj = new File("D:\\Other\\phonebook\\" +nam+ ".csv");
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
//		File dir = new File("D:\\Other\\phonebook");
//		String[] files = dir.list();
//		if (files == null) {
//			System.out.println("Do not exist");
//		} else {
//			for (int i=0; i<files.length; i++) {
//				String filename = files[i];
//				System.out.println(filename);
//			}
//		} 
//		System.out.println("Enter the addressbook to open:");	
//			String cap = n.nextLine();
//			String line = "";  
//			String splitBy = ",";
//					try {
//					BufferedReader br = new BufferedReader(new FileReader("D:\\Other\\phonebook\\"+cap+".csv"));			
//						while ((line = br.readLine()) != null) {
//						String[] c = line.split(splitBy);
//						System.out.println("FirstName:" + c[0] + "\nLastName:" + c[1] + "\nPhone:" + c[2] + "\nCity:" + c[3] + "\nState:" + c[4] + "\nZipcode:" + c[5]+ "\n" );
//						}
//					}catch (IOException e)   
//					{
//						e.printStackTrace();
//					}
					int cond=1;
					while (cond == 1) {
						AddressBookImp menu = new AddressBookImp();
						System.out.println("Address Book:\n"
								+ "1) Add Person\n"
								+ "2) Edit Person\n"
								+ "3) Delete Person\n"
								+ "4) Sort by name\n"
								+ "5) Sort by zip\n"
								+ "6) Search Person\n"
								+ "7)Search Phonenumber\n"
								+ "8)display\n"
								+ "9)quit");
						System.out.println("Select an option from menu: ");
						Scanner input = new Scanner(System.in);
						int num = input.nextInt();
						switch (num) {
						case 1:
							menu.addPerson();
							break;
						case 2:
							menu.editPerson();
							break;
						case 3:
							menu.deletePerson();
							break;
						case 4:
							menu.sortbyName();
							break;
						case 5:
							menu.sortbyZip();
							break;
						case 6:
							menu.searchPerson();
							break;
						case 7:
							menu.searchPhonenumber();
							break;
						case 8:
							menu.display();
							break;
						case 9:
							cond =0;
							break;
						default:
							System.out.println("Incorrect Choice");
						}
					}
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
