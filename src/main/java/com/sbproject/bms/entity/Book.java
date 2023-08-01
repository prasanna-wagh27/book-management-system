package com.sbproject.bms.entity;

import org.hibernate.validator.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookId;
	@NotBlank(message = "Pleae provide Book Name")
	private String bookName;
	private String bookType;
	@Column(columnDefinition = "DOUBLE(5,2)")
	private double bookPrice;
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Book(long bookId, String bookName, String bookType, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookType = bookType;
		this.bookPrice = bookPrice;
	}
	
	public Book() {
			
	}

}
