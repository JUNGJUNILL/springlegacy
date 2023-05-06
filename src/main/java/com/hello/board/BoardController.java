package com.hello.board;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/board")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	//�Խñ� �ۼ� ȭ��
	@RequestMapping(value="/write", method = RequestMethod.GET)
	public String write() {
		return "/board/write"; 
	}
	
	//�Խñ� �ۼ� ����
	@RequestMapping(value="/insert",method =RequestMethod.POST )
	public String insert(@RequestParam Map<String,Object> map) {
		boardService.create(map);
		return "redirect:/board/list"; 
	}
	
	//�Խñ� ��ü ��ȸ
	@RequestMapping(value="/list",method = RequestMethod.GET)
	public ModelAndView list(Map<String, Object> map) {
		ModelAndView mav=new ModelAndView();
		List<BoardDto> list = boardService.listAll(map); 
		System.out.println("list.size()="+list.size());
		mav.addObject("list", list); 
		mav.setViewName("/board/list");
		
		return mav;
	}
	
	//�Խñ� �� ����
	@RequestMapping(value="/view",method = RequestMethod.GET)
	public ModelAndView view(@RequestParam Map<String,String> paramMap) {
			ModelAndView mav =new ModelAndView(); 
			int parambno = Integer.parseInt(paramMap.get("bno")); 
			Map<String,Object> viewDetail = boardService.detailView(parambno); 
			
			mav.addObject("data",viewDetail); 
			mav.setViewName("/board/view");
		
			return mav; 
	}
	
	
}
