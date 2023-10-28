package anudip.org.service;

import java.util.List;
import anudip.org.entity.Customer;

public interface ServiceRepo {
	public List<Customer> getFood();
	 public String insertCus(Customer c);
	 public String updateCus(Customer c);
	 public String deleteCus(Integer id);
	 
}

