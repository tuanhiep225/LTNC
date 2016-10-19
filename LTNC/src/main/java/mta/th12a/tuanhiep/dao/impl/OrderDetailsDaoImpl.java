package mta.th12a.tuanhiep.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mta.th12a.tuanhiep.dao.IOrderDetailsDao;
import mta.th12a.tuanhiep.entity.OrderDetails;
@Repository
public class OrderDetailsDaoImpl implements IOrderDetailsDao{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void add(OrderDetails entity) {
		sessionFactory.getCurrentSession().save(entity);		
	}@Override
	public void delete(int id) {
		sessionFactory.getCurrentSession().delete(getByID(id));
	}@SuppressWarnings("unchecked")
	@Override
	public List<OrderDetails> getAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from OrderDetails").list();
	}@Override
	public OrderDetails getByID(int id) {
		
		return (OrderDetails)sessionFactory.getCurrentSession().get(OrderDetails.class, id);
	}@Override
	public void update(OrderDetails entity) {
		
		
	}
}
