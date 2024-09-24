package com.jensen.dao;


public interface BookDao {

    void save();

    void update();
	
	void delete();

	void method(int id);

    int method3(int id);

    void openUrl(String url,String code);
}
