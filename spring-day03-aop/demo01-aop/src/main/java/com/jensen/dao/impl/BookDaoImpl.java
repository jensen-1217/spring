package com.jensen.dao.impl;

import com.jensen.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author 黑马程序员
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    @Override
    public void update() {
        System.out.println("book dao update ...");
    }
	
	@Override
    public void delete() {
        System.out.println("book dao delete ...");
    }

    @Override
    public void method(int id) {
        System.out.println("book dao method方法..." + id);
    }

    @Override
    public int method3(int id) {
        int i=3/1;
        System.out.println("book dao method3方法..." + id);
        return i;
    }

    @Override
    public void openUrl(String url, String code) {
        System.out.println("URL: "+url+" code: "+code+"|");
    }
}
