package com.restservices.helloworld;


public class UserDetails {
 private String firstName;
 private String lastName;
 private String city;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

public UserDetails(String firstName2, String lastName2, String city2) {
	super();
	this.firstName=firstName2;
	this.lastName=lastName2;
	this.city=city2;
	
}
@Override
public String toString() {
	return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + "]";
}

}
