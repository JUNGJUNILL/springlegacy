package com.hello.spring;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	//å �Է�
	public int insert(Map<String, Object> map) {
		return this.sqlSessionTemplate.insert("book.insert", map);
	}
	
	
	//å �� ����
	public Map<String, Object> selectDetail(Map<String, Object> map) {
	    return this.sqlSessionTemplate.selectOne("book.select_detail", map);
	}
	
	
	//å ����
	public int update(Map<String, Object> map) {
		return this.sqlSessionTemplate.update("book.update",map); 
	}
	
	//å ����
	public int delete(Map<String, Object> map) {
		return this.sqlSessionTemplate.delete("book.delete",map);
		
	}
	
	//å ����Ʈ
	public List<BookDto> selectList(Map<String, Object> map) {
		return this.sqlSessionTemplate.selectList("book.select_list",map); 
		
	}
}
