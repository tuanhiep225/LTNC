package mta.th12a.tuanhiep.rest;

import java.io.IOException;
import java.util.List;

import mta.th12a.tuanhiep.model.Brands;
import mta.th12a.tuanhiep.service.IBrandsService;

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
@RequestMapping(value="/api/brand")
public class BrandsRest {
	@Autowired
	private IBrandsService brandService;
	@RequestMapping(value="/getall",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Brands> getAll()
	{
		return brandService.getAll();
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
	public int update(@RequestBody String data)
	{
		ObjectMapper obj= new ObjectMapper();
		try {
			Brands brand=obj.readValue(data, Brands.class);
			brandService.update(brand);
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
	@RequestMapping(value="/create",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public int create(@RequestBody String data)
	{
		ObjectMapper obj= new ObjectMapper();
		try {
			Brands brand = obj.readValue(data, Brands.class);
			brandService.add(brand);
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
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	public int delete(@PathVariable("id") int data)
	{
		try{
			
			brandService.delete(data);
			return 1;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return 0;
	}
}
