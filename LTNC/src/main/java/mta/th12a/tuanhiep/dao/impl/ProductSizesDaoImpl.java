package mta.th12a.tuanhiep.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mta.th12a.tuanhiep.dao.IProductSizesDao;
import mta.th12a.tuanhiep.model.ProductSizes;
import mta.th12a.tuanhiep.model.Products;
@Repository
public class ProductSizesDaoImpl implements IProductSizesDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void add(ProductSizes entity) {
		sessionFactory.getCurrentSession().save(entity);
		
	}@Override
	public void delete(int id) {
		ProductSizes entity=getByID(id);
		entity.setIsActive(false);
		update(entity);
		
	}@SuppressWarnings("unchecked")
	@Override
	public List<ProductSizes> getAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from productsizes where IsActive=1").list();
	}@Override
	public ProductSizes getByID(int id) {
		
		return (ProductSizes)sessionFactory.getCurrentSession().get(ProductSizes.class, id);
	}@Override
	public void update(ProductSizes entity) {
		sessionFactory.getCurrentSession().update(entity);
		
	}
}
