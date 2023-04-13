package com.hello.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardDao boardDao;

	//게시글 입력
	@Override
	public void create(Map<String, Object> map) {
		 String title  = map.get("title").toString(); 
		 String content = map.get("content").toString(); 
		 String writer = map.get("writer").toString(); 
		
	     title = title.replace("<", "&lt;");
	     title = title.replace("<", "&gt;");
	     writer = writer.replace("<", "&lt;");
	     writer = writer.replace("<", "&gt;");
         title = title.replace("  ",    "&nbsp;&nbsp;");
         writer = writer.replace("  ",    "&nbsp;&nbsp;");
         content = content.replace("\n", "<br>");
         
         Map<String,Object> newMap=new HashMap<>(); 
         newMap.put("title", title);
         newMap.put("content", content);
         newMap.put("writer", writer);
         this.boardDao.insert(newMap);     
	}

	//게시글 조회
	@Override
	public List<BoardDto> listAll(Map<String, Object> map) {
		
		return this.boardDao.selectAll(map); 
	} 
	
	
	
	
	
	

}
