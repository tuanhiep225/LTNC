package mta.th12a.tuanhiep.service;

import java.util.List;

import mta.th12a.tuanhiep.entity.Categories;

public interface ICategoriesService {
	public void add(Categories category);
	public void update (Categories category);
	public void delete (int ID);
	public Categories getByID(int ID);
	public List<Categories> getAll();
}
