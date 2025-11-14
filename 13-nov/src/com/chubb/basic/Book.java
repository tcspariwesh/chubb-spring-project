package com.chubb.basic;
import java.util.*;

public class Book {
	public int id;
	private String name;
	private List<Author> authors; // Has-A, composition
	public String publisher;
	public int num_pages;
	public EDITION edition;
	public Date date_of_printing;
	public float price;
//avoid
	Book(int id, String name, List<Author> authors, String publisher, int num_pages, float price, EDITION edition,
			Date date_of_printing) {
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.num_pages = num_pages;
		this.price = price;
		this.edition = edition;
		this.date_of_printing = date_of_printing;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getNum_pages() {
		return num_pages;
	}

	public void setNum_pages(int num_pages) {
		this.num_pages = num_pages;
	}

	public EDITION getEdition() {
		return edition;
	}

	public void setEdition(EDITION edition) {
		this.edition = edition;
	}

	public Date getDate_of_printing() {
		return date_of_printing;
	}

	public void setDate_of_printing(Date date_of_printing) {
		this.date_of_printing = date_of_printing;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}