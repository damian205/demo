package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {

	@RequestMapping(value ="/hello")
    public ModelAndView test(ModelAndView modelandview)
	{
		
	   ModelAndView mav = new ModelAndView();
		mav.setViewName("helloView");
		String str = "yo!";
	    mav.addObject("message", str);
        return mav;
	
	    }

}
