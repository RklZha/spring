package com.rkl.spring.ioc02.entity;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Project: spring
 * @Author: 查建军
 * @Date: 2019-04-13 21:12
 * @Description:
 */
public class User {
	private String id;
	private String name;
	private String age;

	{
		System.out.println("User.instance initializer");
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", age=" + age + '}';
	}

	public String reValue(String value) {
		System.out.println("User.reValue");
		//判断是否为空
		if (value == null || value.equals("")) {
			return value;
		}
		//方式一：字符串截取
		/*if (value.startsWith("${") && value.endsWith("}")) {
			String key = value.substring(2, value.length() - 1);
			value = getProperty(key);
		}*/
		//方式二：正则表达式
		Pattern pattern = Pattern.compile("\\$\\{(.*)\\}");
		Matcher matcher = pattern.matcher(value);
		if (matcher.matches()) {
			String key = matcher.group(1);
			value = this.getProperty(key);
		}
		return value;
	}

	//根据key获取value
	public String getProperty(String key) {
		Properties properties = new Properties();
		try {
			properties.load(SpringBean.class.getClassLoader().getResourceAsStream("ioc02/application.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (properties.containsKey(key)) {
			return properties.getProperty(key);
		} else {
			throw new RuntimeException("could not found key:" + key + " in properties");
		}
	}


	//初始化方法
	public void init() {
		this.id=reValue(id);
		name=reValue(name);
		age= reValue(age);
		/**
		 *	每次添加新属性需要修改init()方法
		 *  使用反射读取类中的属性
		 */
		/*try {
			Class clazz = Class.forName("com.rkl.spring.ioc02.entity.User");
			System.out.println(clazz);
			Field[] fields = clazz.getDeclaredFields();
			System.out.println(fields);
			int i=1;
			for (Field field : fields) {
				System.out.println(i);
				field.setAccessible(true);
				String value = reValue(field.get(clazz).toString());
				System.out.println("value=" + value);
				field.set(field, value);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}*/

	}

	//销毁方法
	public void destroy() {
		System.out.println("User.destroy");
	}
}
