package com.hello.spring;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/book")
public class BookController {

	@Autowired
	BookService BookService; 
	
	 //책 입력 화면
	@RequestMapping(value="/create", method = RequestMethod.GET)
	public String create() {

	    return"/book/create";
	}
	
	//책 입력 화면 로직
	@RequestMapping(value="/create", method = RequestMethod.POST)
	public ModelAndView createPost(@RequestParam Map<String,Object> map) {
		ModelAndView mav = new ModelAndView(); 
		String bookId = this.BookService.create(map);
		
		if(bookId==null){
			mav.setViewName("redirect:/book/create");
		}else{
			mav.setViewName("redirect:/book/detail?bookId="+bookId);
		}
		
		return mav;	
	}
	
	//책 상세보기
	@RequestMapping(value="/detail", method = RequestMethod.GET)
	public ModelAndView detail(@RequestParam Map<String,Object> map) {
		ModelAndView mav=new ModelAndView();	
		Map<String,Object> detailMap = this.BookService.detail(map); 
		
		mav.addObject("data",detailMap); 
		String bookId = map.get("bookId").toString(); 
		mav.addObject("bookId", bookId); 
		mav.setViewName("/book/detail");
		
		return mav; 
	}
	
	
	//책 수정 화면
	@RequestMapping(value ="/update",method = RequestMethod.GET)
	public ModelAndView update(@RequestParam Map<String,Object> map) {
		ModelAndView mav = new ModelAndView(); 
		Map<String,Object> detailMap = this.BookService.detail(map); 
		
		mav.addObject("data",detailMap);
		mav.setViewName("/book/update");		
		return mav;
	}
	
	//책 수정 로직
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public ModelAndView updatePost(@RequestParam Map<String,Object> map) {
		
		ModelAndView mav = new ModelAndView(); 
		boolean isUpdateSuccess =this.BookService.edit(map); 
		if(isUpdateSuccess) {
			String bookId = map.get("bookId").toString(); 
			mav.setViewName("redirect:/book/detail?bookId="+bookId);
		}else {
			mav = this.update(map); 
		}
				
		return mav;
	}
	
	//책 삭제
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public ModelAndView deletePost(@RequestParam Map<String,Object> map) {
		ModelAndView mav = new ModelAndView(); 
		
		boolean isDeleteSuccess = this.BookService.remove(map);
		
		if(isDeleteSuccess) {
			mav.setViewName("redirect:/book/list");
		}else {
			String bookId = map.get("bookId").toString(); 
			mav.setViewName("redirect:/book/detail?bookId="+bookId);
		}
		
		return mav;
	}
	
	
	//책 리스트 
	@RequestMapping(value = "/list")
	public ModelAndView list(@RequestParam Map<String,Object> map) {
		ModelAndView mav = new ModelAndView(); 
		List<BookDto> list =this.BookService.list(map); 
		
		 Iterator<String> iter = map.keySet().iterator();
		  while(iter.hasNext()) {
	            String key = iter.next();
	            String value = (String) map.get(key);
	            
	            System.out.println(key + " : " + value);
	        }
		  
		mav.addObject("data",list); 
		mav.setViewName("/book/list");
		mav.addObject("keyword", map.get("keyword")); 
		return mav;
	}
	
	
	

}
