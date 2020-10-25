package Phonebook;
import java.util.Scanner;


import java.util.ArrayList;

class AddressBookImp implements AddressBookInterface {
	private static final String String = null;
	public  ArrayList<Person> addressbook;

	public AddressBookImp() {
		addressbook = new ArrayList<Person>();
	}
	
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

	}

	
	public void editPerson() {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter firstname to update details");
		String name = n.nextLine();
		boolean isfound = false;
		for (int i=0; i<addressbook.size(); i++) {
			String personName = addressbook.get(i).firstname;
			if (name.equals(personName)) {
				isfound = true;
				System.out.println(""
						+ "1) Phonenumber"
						+ "2) city"
						+ "3) state"
						+ "4) zipcode"
						+ "5) Quit");
				System.out.println("Select an option to edit: ");
				int num = n.nextInt();
				switch (num) {
				case 1:
				addressbook.remove(i);
				System.out.println("Enter new value:");
				String nu = n.nextLine();
				Person p = new Person(name, addressbook.get(i).lastname, nu, addressbook.get(i).city, addressbook.get(i).state, addressbook.get(i).zipcode);
				addressbook.add(p);
				break;
				case 2:
					addressbook.remove(i);
					System.out.println("Enter new value:");
					String n1 = n.nextLine();
					Person p1 = new Person(name, addressbook.get(i).lastname, addressbook.get(i).phonenumber, n1, addressbook.get(i).state, addressbook.get(i).zipcode);
					addressbook.add(p1);
					break;
				case 3:
					addressbook.remove(i);
					System.out.println("Enter new value:");
					String n2 = n.nextLine();
					Person p2= new Person(name, addressbook.get(i).lastname, addressbook.get(i).phonenumber, addressbook.get(i).city, n2, addressbook.get(i).zipcode);
					addressbook.add(p2);
					break;
				case 4:
					addressbook.remove(i);
					System.out.println("Enter new value:");
					String n3 = n.nextLine();
					Person p3 = new Person(name, addressbook.get(i).lastname, addressbook.get(i).phonenumber, addressbook.get(i).city, addressbook.get(i).state, n3);
					addressbook.add(p3);
					break;
				case 5:
					break;
				}
			}
			if (isfound == false) {
				System.out.println("Not found");
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
	public void sortbyName() {
		// TODO Auto-generated method stub
		
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
		
	}

