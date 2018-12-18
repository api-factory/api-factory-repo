package com.wipro.ass;

import java.util.HashMap;

public class EmpHashMap {
	public static void main(String[] args) {
		HashMap<Integer, Employee> map = new HashMap<>();
		
		map.put(1, new Employee(1, "Monali", "Pune"));
		map.put(2, new Employee(2, "Shalini", "UP"));
		map.put(3, new Employee(3, "Rahul", "Katraj"));
		map.put(4, new Employee(4, "Amit", "Hinjewadi"));
		map.put(5, new Employee(5, "Vishal", "Wakad"));
		map.put(6, new Employee(6, "Sonali", "Pune"));
		
		map.keySet().forEach(a -> System.out.println(map.get(a)));
	}

}
