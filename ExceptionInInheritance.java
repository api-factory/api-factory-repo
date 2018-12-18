package com.wipro.ass;

import java.io.IOException;

class Shape {
	public void draw() throws Exception {
		System.out.println("shape class");
	}
}

class Circle extends Shape {
	public void draw() throws IOException { //throws Throwable - this will show compilation error.
		System.out.println("circle class");
	}
}

public class ExceptionInInheritance {
	public static void main(String[] args) throws Exception {
		Shape s = new Circle();
		s.draw();
	}
}
