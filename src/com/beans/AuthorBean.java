package com.beans;


public class AuthorBean {
private String authorid,firstName,lastName,address1,address2;
long phoneNo;

public AuthorBean() {}
public AuthorBean(String authorid, String firstName, String lastName, long phoneNo,String address1,String address2) {
	super();
	this.authorid = authorid;
	this.firstName = firstName;
	this.lastName = lastName;
	this.phoneNo = phoneNo;
	this.address1 = address1;
	this.address2 = address2;
}
public String getAuthorid() {
	return authorid;
}
public void setAuthorid(String authorid) {
	this.authorid = authorid;
}
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
public String getAddress1() {
	return address1;
}
public void setAddress1(String address1) {
	this.address1 = address1;
}
public String getAddress2() {
	return address2;
}
public void setAddress2(String address2) {
	this.address2 = address2;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}


}
