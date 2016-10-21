package mta.th12a.tuanhiep.dao;

import java.util.List;

import mta.th12a.tuanhiep.model.ProductStores;

public interface IProductsStoresDao {
	public void add(ProductStores entity);
	public void update (ProductStores entity);
	public void delete (int id);
	public ProductStores getByID(int id);
	public List<ProductStores> getAll();
}
