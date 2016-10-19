package mta.th12a.tuanhiep.service;

import java.util.List;

import mta.th12a.tuanhiep.entity.ProductStores;

public interface IProductsStoresService {
	public void add(ProductStores entity);
	public void update (ProductStores entity);
	public void delete (int id);
	public ProductStores getByID(int id);
	public List<ProductStores> getAll();
}
