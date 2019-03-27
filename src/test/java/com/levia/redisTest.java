package com.levia;

import com.levia.redis.RedisDemoApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * Created By Levia.
 * Date: 2019-03-26
 * TIME: 16:26
 */
@SpringBootTest(classes = RedisDemoApp.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class redisTest {
    @Resource
    private RedisTemplate redisTemplate;
    @Test
    public void testRedis(){
        redisTemplate.opsForValue().set("name", "levia");
        System.out.println(redisTemplate.opsForValue().get("name"));
    }
}
