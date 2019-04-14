package com.rkl.spring.ioc01.service.impl;

import com.rkl.spring.ioc01.dao.UserDao;
import com.rkl.spring.ioc01.entity.User;
import com.rkl.spring.ioc01.service.UserService;
import org.springframework.util.StringUtils;

/**
 * @Project: spring
 * @Author: 查建军
 * @Date: 2019-04-13 17:48
 * @Description:
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	/**
	 *
	 * @param username
	 * @param password
	 * @return 返回 0 用户不存在，1 登陆成功，2 用户密码错误；
	 */
	@Override
	public int login(String username, String password) {
		int i = 0;
		User user = userDao.selectByUsername(username);
		System.out.println(user);
		if (!StringUtils.isEmpty(user)) {
			if (user.getPassword().equals(password)) {
				i = 1;
			} else {
				i = 2;
			}
		}
		return i;
	}
}
