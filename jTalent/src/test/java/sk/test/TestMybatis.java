package sk.test;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sk.model.User;
import sk.service.UserService;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class TestMybatis {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TestMybatis.class);

	private UserService userService;
	
	
	public UserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@Test
	public void test1() {
		User u = userService.getUserById(23);
		logger.info(JSON.toJSONString(u));
	}
	
	@Test
	public void test2() {
		List<User> l = userService.getAll();
		logger.info(JSON.toJSONString(l));
	}
}
