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
	
	//게시글 작성 화면
	@RequestMapping(value="/write", method = RequestMethod.GET)
	public String write() {
		return "/board/write"; 
	}
	
	//게시글 작성 로직
	@RequestMapping(value="/insert",method =RequestMethod.POST )
	public String insert(@RequestParam Map<String,Object> map) {
		boardService.create(map);
		return "redirect:/board/list"; 
	}
	
	//게시글 전체 조회
	@RequestMapping(value="/list",method = RequestMethod.GET)
	public ModelAndView list(Map<String, Object> map) {
		ModelAndView mav=new ModelAndView();
		List<BoardDto> list = boardService.listAll(map); 
		System.out.println("list.size()="+list.size());
		mav.addObject("list", list); 
		mav.setViewName("/board/list");
		
		return mav;
	}
	
	//게시글 상세 보기
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
