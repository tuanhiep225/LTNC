package mta.th12a.tuanhiep.rest;

import java.io.IOException;
import java.util.List;

import mta.th12a.tuanhiep.model.Brands;
import mta.th12a.tuanhiep.model.Categories;
import mta.th12a.tuanhiep.service.IBrandsService;
import mta.th12a.tuanhiep.service.ICategoriesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@RestController
public class CategoriesRest {
	@Autowired
	private ICategoriesService categoryService;
	@RequestMapping(value="/category/getall",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Categories> getAll()
	{
		return categoryService.getAll();
	}
	
	@RequestMapping(value="/category/update",method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
	public int update(@RequestBody String data)
	{
		ObjectMapper obj= new ObjectMapper();
		try {
			Categories category=obj.readValue(data, Categories.class);
			categoryService.update(category);
			return 1;
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	@RequestMapping(value="/category/create",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public int create(@RequestBody String data)
	{
		ObjectMapper obj= new ObjectMapper();
		try {
			Categories category = obj.readValue(data, Categories.class);
			categoryService.add(category);
			return 1;
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	@RequestMapping(value="/category/delete/{id}",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	public int delete(@PathVariable("id") int data)
	{
		try{
			
			categoryService.delete(data);
			return 1;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return 0;
	}
}
