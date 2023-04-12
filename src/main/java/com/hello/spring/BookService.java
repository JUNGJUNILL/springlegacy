package com.hello.spring;

import java.util.List;
import java.util.Map;

public interface BookService {

	
	//책 입력
	String create(Map<String, Object> map); 
	
	//책 상세 보기
	Map<String,Object> detail(Map<String, Object> map); 
	
	//책 수정
	boolean edit(Map<String, Object> map);
	
	//책 삭제
	boolean remove(Map<String, Object> map); 
	
	//책 리스트
	List<BookDto> list(Map<String, Object> map);

}


