package com.hello.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/book")
public class BookController {

	@RequestMapping(value="/create", method = RequestMethod.GET)
	public ModelAndView create() {
		System.out.println("�ȳ��ϼ���!");
	    return new ModelAndView("/book/create");
	}
	
}
