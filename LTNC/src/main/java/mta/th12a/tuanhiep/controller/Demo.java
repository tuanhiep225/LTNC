package mta.th12a.tuanhiep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/demo")
public class Demo {
	@RequestMapping(value="/table")
public String Index()
{
	return "table";
}
}
