package Phonebook;
import java.util.*;

import javax.sound.sampled.Line;

import java.io.*;
import java.io.BufferedReader;


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
		} System.out.println("Enter the addressbook to open:");
			
			String cap = n.nextLine();
			String line = "";  
			String splitBy = ",";
					try {
						BufferedReader br = new BufferedReader(new FileReader("D:\\Other\\phonebook\\"+cap+".csv"));			
						while ((line = br.readLine()) != null) {
							String[] employee = line.split(splitBy);
							System.out.println("FirstName=" + employee[0] + "\nLastName=" + employee[1] + "\nPhone=" + employee[2] + "\nCity=" + employee[3] + "\nState= " + employee[4] + "\nZipcode= " + employee[5]+ "\n" );
						}
					} catch (IOException e)   
					{
						e.printStackTrace();
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
