package com.hello.board;

import java.time.LocalDateTime;

public class BoardDto {

	private int bno;
	private String title;
	private String content;
	private String writer;
	private int viewcnt;
	private LocalDateTime insert_Date;
	private LocalDateTime modifier_Date;
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	public LocalDateTime getInsert_Date() {
		return insert_Date;
	}
	public void setInsert_Date(LocalDateTime insert_Date) {
		this.insert_Date = insert_Date;
	}
	public LocalDateTime getModifier_Date() {
		return modifier_Date;
	}
	public void setModifier_Date(LocalDateTime modifier_Date) {
		this.modifier_Date = modifier_Date;
	}
	
	
	
	
}

