package com.rkl.spring.test.ioc01;

import com.rkl.spring.ioc01.entity.SpringBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * @Project: spring
 * @Author: 查建军
 * @Date: 2019-04-13 18:29
 * @Description: 获取IOC容器，读取配置文件，初始化spring上下文，4中方法
 */
public class TestApplication {

	//ApplicationContext
	@Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc01/applicationContext.xml");
		SpringBean springBean = (SpringBean) ac.getBean("springBean");
		System.out.println(springBean);

	}

	//ApplicationContext
	@Test
	public void test2() {
		ApplicationContext ac = new FileSystemXmlApplicationContext("e:/applicationContext.xml");
		SpringBean springBean = (SpringBean) ac.getBean("springBean");
		System.out.println(springBean);
	}

	//BeanFactory
	@Test
	public void test3() {
		Resource resource = new ClassPathResource("ioc01/applicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		SpringBean springBean = (SpringBean) bf.getBean("springBean");
		System.out.println(springBean);
	}

	//BeanFactory
	@Test
	public void test4() {
		Resource resource = new FileSystemResource("e:/applicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		SpringBean springBean = (SpringBean) bf.getBean("springBean");
		System.out.println(springBean);
	}
}
