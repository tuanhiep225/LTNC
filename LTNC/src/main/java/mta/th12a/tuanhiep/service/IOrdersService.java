package mta.th12a.tuanhiep.service;

import java.util.List;

import mta.th12a.tuanhiep.model.Orders;

public interface IOrdersService {
	public void add(Orders entity);
	public void update (Orders entity);
	public void delete (int id);
	public Orders getByID(int id);
	public List<Orders> getAll();
}
