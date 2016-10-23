package mta.th12a.tuanhiep.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mta.th12a.tuanhiep.dao.IProductsStoresDao;
import mta.th12a.tuanhiep.model.ProductSizes;
import mta.th12a.tuanhiep.model.ProductStores;
@Repository
public class ProductsStoresDaoImpl implements IProductsStoresDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void add(ProductStores entity) {
		sessionFactory.getCurrentSession().save(entity);		
	}@Override
	public void delete(int id) {
		ProductStores entity=getByID(id);
		entity.setIsActive(false);
		update(entity);	
	}@SuppressWarnings("unchecked")
	@Override
	public List<ProductStores> getAll() {		
		return sessionFactory.getCurrentSession().createQuery("from productstores where IsActive=1").list();
	}@Override
	public ProductStores getByID(int id) {
		
		return (ProductStores)sessionFactory.getCurrentSession().get(ProductStores.class, id);
	}@Override
	public void update(ProductStores entity) {
		sessionFactory.getCurrentSession().update(entity);
		
	}
}
