package Phonebook;

public class Person {
	//attributes
	  String firstname;  
	  String lastname;
	  String phonenumber;
	  String city;
	  String state;
	  String zipcode;

	  //constructor
	  public Person(String firstname, String lastname, String phonenumber, String city, String state, String zipcode) {
	    this.firstname = firstname;
	    this.lastname = lastname;
	    this.phonenumber = phonenumber;
	    this.city = city;
	    this.state = state;
	    this.zipcode = zipcode;
	  }
	  
	  public String toString() { 
		 return "Name:"+firstname+ " " +lastname+ "Phone:" + phonenumber + "City:" + city + "State:" + state +"Zipcode:" + zipcode;
	  }

}
