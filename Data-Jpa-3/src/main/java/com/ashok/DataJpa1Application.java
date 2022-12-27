package com.ashok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashok.entity.BookStatusEntity;
import com.ashok.repository.BookStatusRepository;

@SpringBootApplication
public class DataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DataJpa1Application.class, args);
		
		BookStatusRepository bean = run.getBean(BookStatusRepository.class);
		
		BookStatusEntity entity=new BookStatusEntity();
		entity.setBookId(101);
		entity.setDriverName("Gunji Ashok");
		entity.setBookingRoute("ADK TO HYD");
		entity.setAmount(700.00);
		bean.save(entity);
		
		run.close();
		
	}

}
