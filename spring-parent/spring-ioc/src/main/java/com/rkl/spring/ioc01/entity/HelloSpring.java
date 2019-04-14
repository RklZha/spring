package com.rkl.spring.ioc01.entity;

/**
 * @Project: spring
 * @Author: 查建军
 * @Date: 2019-04-13 17:28
 * @Description:
 */
public class HelloSpring {
	private String name;

	public HelloSpring() {
		System.out.println("HelloSpring.HelloSpring无参初始化");
	}

	public HelloSpring(String name) {
		this.name = name;
		System.out.println("HelloSpring.HelloSpring" + name);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		HelloSpring that = (HelloSpring) o;

		return name.equals(that.name);

	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return "HelloSpring{" + "name='" + name + '\'' + '}';
	}
}
