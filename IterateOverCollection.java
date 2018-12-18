package com.wipro.ass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateOverCollection {
	
	public static void main(String[] args) {
		List<Employee> l = new ArrayList<>();
		l.add(new Employee(1, "Monali", "Pune"));
		l.add(new Employee(2, "Shalini", "UP"));
		l.add(new Employee(3, "Rahul", "Katraj"));
		l.add(new Employee(4, "Amit", "Hinjewadi"));
		l.add(new Employee(5, "Vishal", "Wakad"));
		l.add(new Employee(6, "Sonali", "Pune"));
		
		Iterator<Employee> itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
