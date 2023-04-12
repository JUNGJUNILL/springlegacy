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

	//책 입력
	public int insert(Map<String, Object> map) {
		return this.sqlSessionTemplate.insert("book.insert", map);
	}
	
	
	//책 상세 보기
	public Map<String, Object> selectDetail(Map<String, Object> map) {
	    return this.sqlSessionTemplate.selectOne("book.select_detail", map);
	}
	
	
	//책 수정
	public int update(Map<String, Object> map) {
		return this.sqlSessionTemplate.update("book.update",map); 
	}
	
	//책 삭제
	public int delete(Map<String, Object> map) {
		return this.sqlSessionTemplate.delete("book.delete",map);
		
	}
	
	//책 리스트
	public List<BookDto> selectList(Map<String, Object> map) {
		return this.sqlSessionTemplate.selectList("book.select_list",map); 
		
	}
}
