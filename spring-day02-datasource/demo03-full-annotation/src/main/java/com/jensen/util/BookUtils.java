package com.jensen.util;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookUtils {

    @Value("${jdbc.password}")
    private String num;

    @Override
    public String toString() {
        return "BookUtils{" +
                "num=" + num +
                '}';
    }
}
