package com.jensen;

import com.jensen.dao.BookDao;
import com.jensen.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo03SpringMybatisApplicationTests {

	@Autowired
	private BookDao bookDao;
	@Test
	void testAll() {
		List<Book> all = bookDao.getAll();
		System.out.println(all);

	}

}
