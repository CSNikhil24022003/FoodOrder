package anudip.org.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import anudip.org.entity.Food;

public interface FoodRepo extends JpaRepository<Food,Integer> {
	public Food findByFname(String name);
	

}
