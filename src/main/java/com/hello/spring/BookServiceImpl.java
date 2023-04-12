package com.hello.spring;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookDao bookDao; 

	 //책 입력
	@Override
	public String create(Map<String, Object> map) {
		
		int affectRowCount = this.bookDao.insert(map); 
		if(affectRowCount==1) {
			return map.get("book_id").toString(); 
		}
		return null;
	}

	//책 상세 보기
	@Override
	public Map<String, Object> detail(Map<String, Object> map) {	
		return this.bookDao.selectDetail(map); 
		
	}

	//책 수정
	@Override
	public boolean edit(Map<String, Object> map) {
		int affectRowCount = this.bookDao.update(map); 		
		return affectRowCount==1;
		
	}

	//책 삭제
	@Override
	public boolean remove(Map<String, Object> map) {
		int affectRowCount = this.bookDao.delete(map); 
		return affectRowCount==1; 
	}

	
	//책 리스트
	@Override
	public List<BookDto> list(Map<String, Object> map) {
		return this.bookDao.selectList(map); 
	}
	
	
	
	
	
	
	
	
	
	
	
}
