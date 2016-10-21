package mta.th12a.tuanhiep.service;

import java.util.List;

import mta.th12a.tuanhiep.model.Customers;

public interface ICustomersService {
	public void add(Customers customer);
	public void update (Customers customer);
	public void delete (int id);
	public Customers getByID(int id);
	public List<Customers> getAll();
}
