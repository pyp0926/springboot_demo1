package com.example.springboot_demo1;

import com.example.springboot_demo1.example.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootTest
class SpringbootDemo1ApplicationTests {


	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Autowired
	private RedisTemplate redisTemplate;
	@Autowired
	private RedisUtil redisUtil;

	private static final Logger logger = LoggerFactory.getLogger(SpringbootDemo1ApplicationTests.class);


	/**
	 * 操作StringRedisTemplate
	 */
	// 操作string
	@Test
	public void testStringRedisTemplateSetString() {
//		String age = "张三";
//		redisUtil.set("age", 18);
//		Object re_age = redisUtil.get("age");
//		System.out.println("re-->" + re_age);
		logger.debug("这是一条调试日志");
		logger.info("这是一条信息日志");
		logger.warn("这是一条警告日志");
		logger.error("这是一条错误日志");

	}

}
