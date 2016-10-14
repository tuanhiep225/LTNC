package mta.th12a.tuanhiep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/brands")
public class BrandsController {
@RequestMapping(value="/index")
public String index()
{
	return "index";
}
}
