package mta.th12a.tuanhiep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BrandsController {
	@RequestMapping(value="/brand/index",method=RequestMethod.GET)
	public String Index()
	{
		return "index";
	}
}
