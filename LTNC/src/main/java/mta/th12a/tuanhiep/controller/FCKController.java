package mta.th12a.tuanhiep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FCKController {
	@RequestMapping(value="/demo")
	public String demo()
	{
		return "index";
	}
}
