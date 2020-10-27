package Phonebook;
import java.util.Scanner;
//import java.io.FileWriter;
//import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator; 

class AddressBookImp implements AddressBookInterface {
	
	public static ArrayList<Person> addressbook = new ArrayList<Person>();
	 
	public void addPerson() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the firstName:");
		String firstName = inp.nextLine();
		System.out.println("Enter the LastName:");
		String lastName = inp.nextLine();
		System.out.println("Enter the phone:");
		String phonenum = inp.nextLine();
		System.out.println("Enter the city:");
		String city = inp.nextLine();
		System.out.println("Enter the state:");
		String state = inp.nextLine();
		System.out.println("Enter the zipcode:");
		String zipcode = inp.nextLine();
		Person p = new Person(firstName, lastName, phonenum, city, state, zipcode);
		addressbook.add(p);
//		System.out.println(addressbook);
	}

	
	public void editPerson() {
		Scanner opt = new Scanner(System.in);
		System.out.println("Enter firstname to update details");
		String name = opt.nextLine();
		int i;
		Person p;
		boolean isfound = false;
		for (i=0; i<addressbook.size(); i++) {
			String firstName = addressbook.get(i).firstname;
			String lastName = addressbook.get(i).lastname;
			String phone = addressbook.get(i).phonenumber;
			String city = addressbook.get(i).city;
			String state = addressbook.get(i).state;
			String zipcode = addressbook.get(i).zipcode;
			if (name.equals(firstName)) {
					isfound = true;
					System.out.println("\"Select an option to edit:\n"
						+ "1) Phonenumber\n"
						+ "2) city\n"
						+ "3) state\n"
						+ "4) zipcode\n"
						+ "5) Quit");
				int numb = opt.nextInt();
				Scanner n = new Scanner(System.in);
				switch (numb) {
				case 1:
				addressbook.remove(i);
				System.out.println("Enter new value:");
				String phn = n.nextLine();
				p = new Person(firstName, lastName, phn, city, state, zipcode);
				addressbook.add(p);
				System.out.println(addressbook);
				break;
				case 2:
				addressbook.remove(i);
				System.out.println("Enter new value:");
				String c = n.nextLine();
				Person p1 = new Person(firstName, lastName, phone, c, state, zipcode);
				addressbook.add(p1);
				System.out.println(addressbook);
				break;
				case 3:
				addressbook.remove(i);
				System.out.println("Enter new value:");
				String s = n.nextLine();
				Person p2= new Person(firstName, lastName, phone, city, s, zipcode);
				addressbook.add(p2);
				System.out.println(addressbook);
				break;
				case 4:
				addressbook.remove(i);
				System.out.println("Enter new zipcode:");
				String zip = n.nextLine();
				Person p3 = new Person(firstName, lastName, phone, city, state, zip);
				addressbook.add(p3);
				System.out.println(addressbook);
				break;
				case 5:
				break;
		}		System.out.println("updated details..\n");
				System.out.println(addressbook);
			}
			if (isfound == false) {
				System.out.println("Name not found");
			}
		}
	}

	
	public void deletePerson() {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter firstname to delete its entries");
		String name = n.nextLine();
		boolean isfound = false;
		for (int i=0; i<addressbook.size(); i++) {
			String personName = addressbook.get(i).firstname;
			if (name.equals(personName)) {
				isfound = true;
				addressbook.remove(i);
				System.out.println("Entry deleted");
			}
		}
			if (isfound == false) {
				System.out.println("Not found");
			}
		
	}

	


	@Override
	public void sortbyZip() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void searchPerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchPhonenumber() {
		// TODO Auto-generated method stub
		
	}
	public void display() {
	System.out.println("Getting info");
	
//		for (Person person : addressbook) {
//			System.out.println(person.toString());
//			}
//		
//		Iterator i =addressbook.iterator();
//	      System.out.println("The ArrayList elements are:");
//	      while (i.hasNext()) {
//	         System.out.println(i.next());
//	      }
		 for (int i=0; i<addressbook.size(); i++) {	
			System.out.println(addressbook.get(i));
			
		}
	}
		
	}

