package com.jensen.springdataredisdemo01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.DataType;
import org.springframework.data.redis.core.*;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class SpringDataRedisDemo01ApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test01String(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("username","白岩");
        Object username = valueOperations.get("username");
        System.out.println("username = " + username);

        valueOperations.set("address","上海",15, TimeUnit.SECONDS);
        Boolean boo = valueOperations.setIfPresent("username", "白岩的爸爸");
        Object address = valueOperations.get("address");
        System.out.println("address = " + address);
        Object username1 = valueOperations.get("username");
        System.out.println("username1 = " + username1);
        System.out.println("boo = " + boo);
        Boolean boo1 = valueOperations.setIfAbsent("age", "20");
        System.out.println("boo1 = " + boo1);
        Object age = valueOperations.get("age");
        System.out.println("age = " + age);


    }

    @Test
    public void test02Hash(){
        HashOperations hashOperations = redisTemplate.opsForHash();
        hashOperations.put("person","name","白岩的爸爸");
        hashOperations.put("person","pwd","123456");
        Object o = hashOperations.get("person", "name");
        System.out.println("o = " + o);

        Set keys = hashOperations.keys("person");
        List values= hashOperations.values("person");
        Iterator<String> keyIterator = keys.iterator();
        Iterator<Object> valueIterator = values.iterator();

        while (keyIterator.hasNext() && valueIterator.hasNext()) {
            String key = keyIterator.next();
            Object value = valueIterator.next();

            // 处理 key 和 value 的逻辑
            System.out.println("Key: " + key + ", Value: " + value);
        }

    }

    @Test
    public void testList(){
        ListOperations listOperations = redisTemplate.opsForList();
         listOperations.leftPush("name", "白岩");
         listOperations.leftPush("name", "白岩");
        List name = listOperations.range("name", 0, -1);
        System.out.println("name = " + name);

    }

    @Test
    public void testSet(){
        SetOperations setOperations = redisTemplate.opsForSet();
//        setOperations.add("myset","语文","数学","英语");
//        Set myset = setOperations.members("myset");
//        for (Object o : myset) {
//            System.out.println("o = " + o);
//        }
//        System.out.println("myset = " + myset);
//        Long remove = setOperations.remove("myset", "语文");
//        System.out.println("remove = " + remove);
        redisTemplate.delete("myset");

    }

    @Test
    public void testZset(){
        ZSetOperations zSetOperations = redisTemplate.opsForZSet();
        zSetOperations.add("myset","白岩",5);
        zSetOperations.add("myset","白岩2",2);
        zSetOperations.add("myset","白岩3",6);
        Set myset = zSetOperations.range("myset", 0, -1);
        for (Object o : myset) {
            System.out.println("o = " + o);
        }
        zSetOperations.incrementScore("myset","白岩2",9);
        Double score = zSetOperations.score("myset", "白岩2");
        System.out.println("score = " + score);
        Set myset1 = zSetOperations.reverseRange("myset", 0, -1);
        for (Object o : myset1) {
            System.out.println("o = " + o);
        }
        Set<ZSetOperations.TypedTuple> myset2 = zSetOperations.rangeWithScores("myset", 0, -1);
        for (ZSetOperations.TypedTuple tt : myset2) {
            Double score1 = tt.getScore();
            Object value = tt.getValue();
            System.out.println(score1+"------" + value);
        }
        zSetOperations.remove("myset","白岩","白岩2","白岩3");
    }

    @Test
    public void testCommon(){
        Set keys = redisTemplate.keys("*");
        for (Object key : keys) {
            System.out.println("key = " + key);
        }

        Boolean boo = redisTemplate.hasKey("age1");
        System.out.println("boo = " + boo);

        DataType ageType = redisTemplate.type("age");
        System.out.println("ageType = " + ageType);

    }

}
