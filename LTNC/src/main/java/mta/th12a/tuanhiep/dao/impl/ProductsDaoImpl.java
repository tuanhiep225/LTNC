package mta.th12a.tuanhiep.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mta.th12a.tuanhiep.dao.IProductsDao;
import mta.th12a.tuanhiep.entity.Products;
@Repository
public class ProductsDaoImpl implements IProductsDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void add(Products entity) {
		sessionFactory.getCurrentSession().save(entity);
		
	}@Override
	public void delete(int id) {
		sessionFactory.getCurrentSession().delete(getByID(id));
		
	}@SuppressWarnings("unchecked")
	@Override
	public List<Products> getAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from products").list();
	}@Override
	public Products getByID(int id) {
		
		return (Products)sessionFactory.getCurrentSession().get(Products.class, id);
	}@Override
	public void update(Products entity) {
		sessionFactory.getCurrentSession().update(entity);
		
	}
}
