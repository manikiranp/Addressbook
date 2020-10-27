package Phonebook;

public class Person {
	//attributes
	  public String firstname;  
	  public String lastname;
	  public String phonenumber;
	  public String city;
	  public String state;
	  public String zipcode;

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
		 return "Name:"+firstname+ " " +lastname+ ", Phone:" + phonenumber + ", City:" + city + ", State:" + state +", Zipcode:" + zipcode;
	  }

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
