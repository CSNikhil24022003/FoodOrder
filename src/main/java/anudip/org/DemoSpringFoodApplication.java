package anudip.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import anudip.org.utility.OrderConformation;

@SpringBootApplication
public class DemoSpringFoodApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=
		SpringApplication.run(DemoSpringFoodApplication.class, args);
		OrderConformation o=(OrderConformation) con.getBean(OrderConformation.class);
	   
		
		
		
	}

}
