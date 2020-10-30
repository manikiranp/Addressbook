package Phonebook;
import java.util.*;
import java.util.stream.Collectors;

import com.opencsv.CSVWriter;

import java.io.*;


public class AddressBookManagerImp implements AddressBookManagerInterface {
	
	//public static ArrayList<Person> addressbook = new ArrayList<Person>();
	Scanner n = new Scanner(System.in);
	private Scanner input;
	String cap;
	private static final String CSV_HEADER = "firstname,lastname,phonenumber,city,state,zipcode";

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
		
		File dir = new File("D:\\Other\\phonebook");
		String[] files = dir.list();
		if (files == null) {
			System.out.println("Do not exist");
		} else {
			for (int i=0; i<files.length; i++) {
				String filename = files[i];
				System.out.println(filename);
			}
		} 
		System.out.println("Enter the addressbook to open:");
		cap = n.nextLine();
//		for (int i=0; i<files.length; i++) {
//			String filename = files[i];
//			if (filename.equals(cap+".csv")) {
//				System.out.println("file found");
				int cond=1;
				while (cond == 1) {
					AddressBookImp menu = new AddressBookImp();
					System.out.println("Address Book:"+cap+"\n"
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
					input = new Scanner(System.in);
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
//			else 
//				System.out.println("file not found");
//				break;
			
//		}
//		
//	}
//			

	public void saveAddressBook() {
		
		 FileWriter writer = null;
		try {
			
			writer = new FileWriter("contacts.csv");
			writer.append(CSV_HEADER);
			writer.append("\n");
			for (Person p : AddressBookImp.addressbook) {
				writer.append(p.getFirstname());
				writer.append(",");
				writer.append(p.getLastname());
				writer.append(",");
				writer.append(p.getPhonenumber());
				writer.append(",");
				writer.append(p.getCity());
				writer.append(",");
				writer.append(p.getState());
				writer.append(",");
				writer.append(p.getZipcode());
				writer.append("\n");
			}
			System.out.println("data saved.");
	}	 
		catch (IOException e) {
			System.out.println("Writing CSV error!");
			e.printStackTrace();
		} finally {
			try {
		    writer.flush();
		    writer.close();
			} catch (IOException e) {
		        System.out.println("Flushing/closing error!");
		        e.printStackTrace();
		      }
		}
		
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
