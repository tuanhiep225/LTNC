package mta.th12a.tuanhiep.service;

import java.util.List;

import mta.th12a.tuanhiep.entity.Products;

public interface IProductsService {
	public void add(Products entity);
	public void update (Products entity);
	public void delete (int id);
	public Products getByID(int id);
	public List<Products> getAll();
}
