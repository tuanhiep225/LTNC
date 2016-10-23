package mta.th12a.tuanhiep.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mta.th12a.tuanhiep.dao.ICategoriesDao;
import mta.th12a.tuanhiep.model.Brands;
import mta.th12a.tuanhiep.model.Categories;
@Repository
public class CategoriesDaoImpl implements ICategoriesDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void add(Categories category) {
		sessionFactory.getCurrentSession().save(category);
		
	}@Override
	public void delete(int ID) {		
		Categories entity=getByID(ID);
		entity.setIsActive(false);
		update(entity);
	}@SuppressWarnings("unchecked")
	@Override
	public List<Categories> getAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from Categories where IsActive=1").list();
	}@Override
	public Categories getByID(int ID) {
		
		return (Categories)sessionFactory.getCurrentSession().get(Categories.class, ID);
	}@Override
	public void update(Categories category) {
		sessionFactory.getCurrentSession().update(category);
		
	}
}
