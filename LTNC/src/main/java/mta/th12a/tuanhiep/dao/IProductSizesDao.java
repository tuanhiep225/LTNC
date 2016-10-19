package mta.th12a.tuanhiep.dao;

import java.util.List;

import mta.th12a.tuanhiep.entity.ProductSizes;

public interface IProductSizesDao {
	public void add(ProductSizes entity);
	public void update (ProductSizes entity);
	public void delete (int id);
	public ProductSizes getByID(int id);
	public List<ProductSizes> getAll();
}
