package com.hello.spring;

import java.time.LocalDateTime;

public class BookDto {
	
	private int book_id;
	private String title;
	private String category;
	private int price;
	private LocalDateTime insert_date;
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDateTime getInsert_date() {
		return insert_date;
	}
	public void setInsert_date(LocalDateTime insert_date) {
		this.insert_date = insert_date;
	}
	
	

}
