package mta.th12a.tuanhiep.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mta.th12a.tuanhiep.dao.IProductsStoresDao;
import mta.th12a.tuanhiep.entity.ProductStores;
@Repository
public class ProductsStoresDaoImpl implements IProductsStoresDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void add(ProductStores entity) {
		sessionFactory.getCurrentSession().save(entity);		
	}@Override
	public void delete(int id) {
		sessionFactory.getCurrentSession().delete(getByID(id));		
	}@SuppressWarnings("unchecked")
	@Override
	public List<ProductStores> getAll() {		
		return sessionFactory.getCurrentSession().createQuery("from productstores").list();
	}@Override
	public ProductStores getByID(int id) {
		
		return (ProductStores)sessionFactory.getCurrentSession().get(ProductStores.class, id);
	}@Override
	public void update(ProductStores entity) {
		sessionFactory.getCurrentSession().update(entity);
		
	}
}
