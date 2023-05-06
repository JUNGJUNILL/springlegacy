package com.hello.board;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	//게시글 입력
	public int insert(Map<String, Object> map) {
		return this.sqlSessionTemplate.insert("board.insert",map); 
	}
	
	//게시글 조회
	public List<BoardDto> selectAll(Map<String, Object> map){
		return this.sqlSessionTemplate.selectList("board.select_list",map); 
	}
	
	//게시글 하나조회
	public Map<String,Object> viewDetail(int bno){
		
		return this.sqlSessionTemplate.selectOne("board.view_Detail",bno); 
	}
	
	


}
