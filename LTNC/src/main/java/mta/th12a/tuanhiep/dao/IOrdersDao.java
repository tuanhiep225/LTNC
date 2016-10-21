package mta.th12a.tuanhiep.dao;

import java.util.List;

import mta.th12a.tuanhiep.model.Orders;

public interface IOrdersDao {
	public void add(Orders entity);
	public void update (Orders entity);
	public void delete (int id);
	public Orders getByID(int id);
	public List<Orders> getAll();
}
