package com.hello.board;

import java.util.List;
import java.util.Map;

public interface BoardService {

	//�Խñ� �Է�
	void create(Map<String, Object> map); 
	
	//�Խñ� ��ȸ
	List<BoardDto> listAll(Map<String, Object> map); 
}
