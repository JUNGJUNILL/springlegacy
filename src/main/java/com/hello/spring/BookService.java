package com.hello.spring;

import java.util.List;
import java.util.Map;

public interface BookService {

	
	//å �Է�
	String create(Map<String, Object> map); 
	
	//å �� ����
	Map<String,Object> detail(Map<String, Object> map); 
	
	//å ����
	boolean edit(Map<String, Object> map);
	
	//å ����
	boolean remove(Map<String, Object> map); 
	
	//å ����Ʈ
	List<BookDto> list(Map<String, Object> map);

}


