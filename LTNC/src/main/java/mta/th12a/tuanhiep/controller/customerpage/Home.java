package mta.th12a.tuanhiep.controller.customerpage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mta.th12a.tuanhiep.dto.CategoryDTO;
import mta.th12a.tuanhiep.model.Categories;
import mta.th12a.tuanhiep.service.ICategoriesService;
import mta.th12a.tuanhiep.service.impl.CategoriesServiceImpl;

@Controller
public class Home extends BaseController {
	@Autowired
	ICategoriesService category;
	@RequestMapping("/home")
	public String home(ModelMap model)
	{
		/*List<CategoryDTO> listCategoryDTO=new ArrayList<CategoryDTO>();
		List<Categories> listParentCategory=category.getListParent();
		for (Categories categories : listParentCategory) {
			CategoryDTO categoryDTO=new CategoryDTO();
			categoryDTO.setParentCategory(categories);
			List<Categories> listchild=category.getByIDParent(categories.getCategoryId());
			categoryDTO.setChildCategory(listchild);
			listCategoryDTO.add(categoryDTO);
		}
		model.put("listCategory", listCategoryDTO);*/
		return "home-index";
	}
}
