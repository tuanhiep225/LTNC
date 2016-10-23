package mta.th12a.tuanhiep.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mta.th12a.tuanhiep.dao.ICustomersDao;
import mta.th12a.tuanhiep.model.Categories;
import mta.th12a.tuanhiep.model.Customers;
@Repository
public class CustomersDaoImpl implements ICustomersDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void add(Customers customer) {
		sessionFactory.getCurrentSession().save(customer);
		
	}@Override
	public void delete(int id) {
		Customers entity=getByID(id);
		entity.setIsActive(false);
		update(entity);
		
	}@SuppressWarnings("unchecked")
	@Override
	public List<Customers> getAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from Customers where IsActive=1").list();
	}@Override
	public Customers getByID(int id) {
		
		return (Customers)sessionFactory.getCurrentSession().get(Customers.class, id);
	}@Override
	public void update(Customers customer) {
		sessionFactory.getCurrentSession().update(customer);
		
	}
}
