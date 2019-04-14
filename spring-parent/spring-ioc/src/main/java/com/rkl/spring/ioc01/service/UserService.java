package com.rkl.spring.ioc01.service;

/**
 * @Project: spring
 * @Author: 查建军
 * @Date: 2019-04-13 17:48
 * @Description:
 */
public interface UserService {
	/**
	 *
	 * @param username
	 * @param password
	 * @return 返回 0 用户不存在，1 登陆成功，2 用户密码错误；
	 */
	public int login(String username,String password);
}
