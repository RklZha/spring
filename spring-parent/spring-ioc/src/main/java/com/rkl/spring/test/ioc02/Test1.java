package com.rkl.spring.test.ioc02;

import com.rkl.spring.ioc02.entity.SpringBean;
import com.rkl.spring.ioc02.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Project: spring
 * @Author: 查建军
 * @Date: 2019-04-13 20:21
 * @Description: 初始化和销毁bean
 */
public class Test1 {
	private final ApplicationContext ac = new ClassPathXmlApplicationContext("ioc02/applicationContext.xml");

	@Test
	public void test01() {

		SpringBean springBean = (SpringBean) ac.getBean("springBean");
		System.out.println(springBean);
		//立即销毁springBean
		springBean.destroy();
	}

	@Test
	public void test02() {
		Properties p = new Properties();
		InputStream is = Test1.class.getClassLoader().getResourceAsStream("ioc02/application.properties");
		try {
			p.load(is);
			System.out.println(p.getProperty("bean.id"));
			System.out.println(p.getProperty("bean.name"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test03() {
		User user = (User) ac.getBean("user");
		System.out.println(user);
	}
}
