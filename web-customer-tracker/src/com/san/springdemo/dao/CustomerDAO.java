package com.san.springdemo.dao;

import java.util.List;

import com.san.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theID);

	public List<Customer> searchCustomers(String theSearchName);
	
}
