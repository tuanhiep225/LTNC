package mta.th12a.tuanhiep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mta.th12a.tuanhiep.service.IBrandsService;

@Controller
@RequestMapping(value="/brand")
public class BrandsController {
	@Autowired
	IBrandsService brandService;
	@RequestMapping(value="/index")
	public ModelAndView Index()
	{
		
		return new ModelAndView("index","listBrand",brandService.getAll());
	}
}
