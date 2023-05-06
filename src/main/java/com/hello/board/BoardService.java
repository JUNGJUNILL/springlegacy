package com.hello.board;

import java.util.List;
import java.util.Map;

public interface BoardService {

	//게시글 입력
	void create(Map<String, Object> map); 
	
	//게시글 조회
	List<BoardDto> listAll(Map<String, Object> map); 
	
	//게시글 하나 조회
	Map<String,Object> detailView(int bno); 
}
