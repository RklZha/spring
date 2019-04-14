package com.rkl.spring.ioc01.dao;

import com.rkl.spring.ioc01.entity.User;

/**
 * @Project: spring
 * @Author: 查建军
 * @Date: 2019-04-13 17:44
 * @Description:
 */
public interface UserDao {

	public User selectByUsername(String username);

}
