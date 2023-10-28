package anudip.org.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import anudip.org.entity.Customer;
import anudip.org.entity.repo.CusRepo;
@Service
public class ServiceImpl implements ServiceRepo{
	@Autowired
	CusRepo cusrepo;
	public CusRepo getCusrepo() {
		return cusrepo;
	}
	public void setCusrepo(CusRepo cusrepo) {
		this.cusrepo = cusrepo;
	}
	public List<Customer> getFood() {
		List<Customer> list=cusrepo.findAll();
		return list;
	}
	public String insertCus(Customer c) {
		cusrepo.save(c);
		return "Record inserted";
	}	
	public String updateCus(Customer c) {
		cusrepo.save(c);
		return "Record updated";
	}
	public String deleteCus(Integer id) {
		cusrepo.deleteById(id);
		   return "Record deleted";
	}
}