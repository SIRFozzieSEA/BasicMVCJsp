package com.codef.research;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class JspController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView listAction() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		mv.addObject("name", "Stephan");
		return mv;

	}

}
