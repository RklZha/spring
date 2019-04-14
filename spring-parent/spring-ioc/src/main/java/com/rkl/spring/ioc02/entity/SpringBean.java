package com.rkl.spring.ioc02.entity;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Project: spring
 * @Author: 查建军
 * @Date: 2019-04-13 18:45
 * @Description:
 */
public class SpringBean {
	private String id;
	private String name;

	{
		System.out.println("静态代码块");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "SpringBean{" + "id='" + id + '\'' + ", name='" + name + '\'' + '}';
	}

	//初始化方法
	public void init (){
		System.out.println("SpringBean{" + "id='" + id + '\'' + ", name='" + name + '\'' + '}');
	}

	//销毁方法
	public void destroy() {
		System.out.println("SpringBean.destroy");
	}

}
