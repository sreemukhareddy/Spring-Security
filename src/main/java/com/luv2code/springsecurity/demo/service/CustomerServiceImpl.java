package com.luv2code.springsecurity.demo.service;

import java.util.List;

import com.luv2code.springsecurity.demo.dao.CustomerDAO;
import com.luv2code.springsecurity.demo.dao.CustomerDAOImpl;
import com.luv2code.springsecurity.demo.entity.Customer;
public class CustomerServiceImpl implements CustomerService {

	
	
	 CustomerDAO customerDAO=new CustomerDAOImpl();


	@Override
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	public void saveCustomer(Customer theCustomer) {

		customerDAO.saveCustomer(theCustomer);
	}

	@Override
	public Customer getCustomer(int theId) {
		
		return customerDAO.getCustomer(theId);
	}

	@Override
	public void deleteCustomer(int theId) {
		
		customerDAO.deleteCustomer(theId);
	}
}





