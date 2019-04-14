package com.rkl.spring.test.ioc01;

import com.rkl.spring.ioc01.entity.HelloSpring;
import com.rkl.spring.ioc01.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project: spring
 * @Author: 查建军
 * @Date: 2019-04-13 17:31
 * @Description:
 */
public class TestIoc {
	/*获取IOC容器，读取配置文件，初始化spring上下文*/
	private static ApplicationContext ac = new ClassPathXmlApplicationContext("ioc01/applicationContext.xml");


	@Test
	public void testIOC01(){
		/*根据id获取bean*/
		HelloSpring helloSpring = (HelloSpring) ac.getBean("helloSpring");
		System.out.println(helloSpring);
	}

	@Test
	public void testIOC02(){
		/*根据id获取bean*/
		UserService userService = (UserService) ac.getBean("userService");
		int b = userService.login("jack","123456");
		if(b==0){
			System.out.println("用户不存在");
		}else if(b==1){
			System.out.println("登陆成功");
		}else{
			System.out.println("用户密码错误");
		}

	}
}
