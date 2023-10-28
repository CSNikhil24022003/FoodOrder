package anudip.org.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import anudip.org.entity.Customer;

public interface CusRepo extends JpaRepository<Customer,Integer>{

}
