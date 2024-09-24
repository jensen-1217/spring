package com.jensen;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Map;

public class JedisTest {

    @Test
    public void testHash(){
        Jedis jedis = new Jedis("192.168.93.132", 6379);
        jedis.hset("user","username","白岩");
        jedis.hset("user","password","123456");

        String username = jedis.hget("user", "username");
        String password = jedis.hget("user", "password");
        System.out.println("password = " + password);
        System.out.println("username = " + username);
        Map<String, String> map = jedis.hgetAll("user");
        System.out.println("map = " + map);
        map.forEach((filed,value)->{
            System.out.println(filed+"-----" + value);
        });
//        Long hdel = jedis.hdel("user", "password");
//        System.out.println("hdel = " + hdel);

        jedis.close();

    }

    @Test
    public void testString(){
        Jedis jedis = new Jedis("192.168.93.132", 6379);
//        String s = jedis.set("username", "白岩");
//        System.out.println("s = " + s);
//
//        String username = jedis.get("username");
//        System.out.println("username = " + username);
        Long username = jedis.del("username");
        System.out.println("username = " + username);

        jedis.close();
    }

}
