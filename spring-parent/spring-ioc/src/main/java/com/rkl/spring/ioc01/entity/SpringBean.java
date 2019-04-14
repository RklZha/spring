package com.rkl.spring.ioc01.entity;

import java.util.*;

/**
 * @Project: spring
 * @Author: 查建军
 * @Date: 2019-04-13 18:45
 * @Description:
 */
public class SpringBean {
	private HelloSpring helloSpring;
	private Integer[] arrays;
	private List<HelloSpring> lists;
	private Set<HelloSpring> sets;
	private Map<HelloSpring,Class> map;
	private Properties properties;

	public HelloSpring getHelloSpring() {
		return helloSpring;
	}

	public void setHelloSpring(HelloSpring helloSpring) {
		this.helloSpring = helloSpring;
	}

	public Integer[] getArrays() {
		return arrays;
	}

	public void setArrays(Integer[] arrays) {
		this.arrays = arrays;
	}

	public List<HelloSpring> getLists() {
		return lists;
	}

	public void setLists(List<HelloSpring> lists) {
		this.lists = lists;
	}

	public Set<HelloSpring> getSets() {
		return sets;
	}

	public void setSets(Set<HelloSpring> sets) {
		this.sets = sets;
	}

	public Map<HelloSpring, Class> getMap() {
		return map;
	}

	public void setMap(Map<HelloSpring, Class> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "SpringBean{" + "helloSpring=" + helloSpring + ", arrays=" + Arrays.toString(arrays) + ", lists=" + lists
				+ ", sets=" + sets + ", map=" + map + ", properties=" + properties + '}';
	}
}
