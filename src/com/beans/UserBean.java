package com.beans;

public class UserBean {
private int userId;
private String firstName,lastName;
private long phoneNo;

public UserBean(int userId, String firstName, String lastName, long phoneNo) {
	super();
	this.userId = userId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.phoneNo = phoneNo;
}

public UserBean() {
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
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

public long getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}


}
