package com.beans;

public class BookBean {
private String isbnno,title,author,publisher;
private int quantity,issued;
public BookBean() {
	super();
	// TODO Auto-generated constructor stub
}
public BookBean(String isbnno, String title, String author, String publisher, int quantity) {
	super();
	this.isbnno = isbnno;
	this.title = title;
	this.author = author;
	this.publisher = publisher;
	this.quantity = quantity;
}
public String getIsbnno() {
	return isbnno;
}
public void setIsbnno(String isbnno) {
	this.isbnno = isbnno;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getIssued() {
	return issued;
}
public void setIssued(int issued) {
	this.issued = issued;
}

}
