package mta.th12a.tuanhiep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/brand")
public class BrandsController {
	@RequestMapping(value="/index")
	public String Index()
	{
		return "index";
	}
}
