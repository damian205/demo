package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() 
	{
		return "dd";
	    //ModelAndView mav = new ModelAndView();
		//mav.setViewName("hello");
		//String str = "Hello World!";
	    //mav.addObject("message", str);
        //return mav;
	
	    }

}
