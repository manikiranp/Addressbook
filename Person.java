package Phonebook;

public class Person {
	//attributes
	  String firstname;  
	  String lastname;
	  long phonenumber;
	  String city;
	  String state;
	  int zipcode;

	  //constructor
	  public Person(String firstname, String lastname, long phonenumber, String city, String state, int zipcode) {
	    this.firstname = firstname;
	    this.lastname = lastname;
	    this.phonenumber = phonenumber;
	    this.city = city;
	    this.state = state;
	    this.zipcode = zipcode;
	  }
	  
	  public String toString() { 
		  return "Name:" + firstname +" "+ lastname + "\n" 
		  		+ "Phone:" + phonenumber "\n"
	  }

}
