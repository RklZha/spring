package com.rkl.spring.ioc01.dao.impl;

import com.rkl.spring.ioc01.dao.UserDao;
import com.rkl.spring.ioc01.entity.User;

/**
 * @Project: spring
 * @Author: 查建军
 * @Date: 2019-04-13 17:46
 * @Description:
 */
public class UserDaoImpl implements UserDao {
	@Override
	public User selectByUsername(String username) {
		System.out.println("使用JDBC查询");
		User user = new User();
		user.setUsername("jack");
		user.setPassword("123456");
		return user;
	}
}
