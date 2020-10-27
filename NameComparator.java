package Phonebook;
import java.util.Comparator;



class NameComparator implements Comparator<Person> {
	public int compare(Person p1, Person p2) {
		
		return p1.firstname.compareTo(p2.firstname);
	}
}

class ZipComparator implements Comparator<Person> {
	public int compare(Person p1, Person p2) {
		
		return p1.zipcode.compareTo(p2.zipcode);
		}
}
