package com.jensen;

import com.jensen.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo02SpringFileApplicationTests {

	@Autowired
	private BookService bookService;
	@Test
	void contextLoads() {
		bookService.save();
	}

}
