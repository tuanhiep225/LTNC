package mta.th12a.tuanhiep.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mta.th12a.tuanhiep.dao.IProductCorlorsDao;
import mta.th12a.tuanhiep.model.ProductColors;
@Repository
public class ProductCorlorsDaoImpl implements IProductCorlorsDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void add(ProductColors entity) {
		sessionFactory.getCurrentSession().save(entity);
		
	}@Override
	public void delete(int id) {
		sessionFactory.getCurrentSession().delete(getByID(id));
		
	}@SuppressWarnings("unchecked")
	@Override
	public List<ProductColors> getAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from productcolors").list();
	}@Override
	public ProductColors getByID(int id) {
		
		return (ProductColors)sessionFactory.getCurrentSession().get(ProductColors.class, id);
	}@Override
	public void update(ProductColors entity) {
		sessionFactory.getCurrentSession().update(entity);
		
	}
}
