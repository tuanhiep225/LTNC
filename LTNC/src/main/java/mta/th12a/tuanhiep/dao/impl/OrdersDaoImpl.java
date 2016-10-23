package mta.th12a.tuanhiep.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mta.th12a.tuanhiep.dao.IOrdersDao;
import mta.th12a.tuanhiep.model.OrderDetails;
import mta.th12a.tuanhiep.model.Orders;
@Repository
public class OrdersDaoImpl implements IOrdersDao {
	@Autowired
	SessionFactory sessionFactory;
	public void add(Orders entity) {
		sessionFactory.getCurrentSession().save(entity);
		
	}@Override
	public void delete(int id) {
		Orders entity=getByID(id);
		entity.setIsActive(false);
		update(entity);
		
	}@SuppressWarnings("unchecked")
	@Override
	public List<Orders> getAll() {		
		return sessionFactory.getCurrentSession().createQuery("from Orders where IsActive=1").list();
	}@Override
	public Orders getByID(int id) {
		
		return (Orders)sessionFactory.getCurrentSession().get(Orders.class, id);
	}@Override
	public void update(Orders entity) {
		sessionFactory.getCurrentSession().update(entity);
		
	}
}
