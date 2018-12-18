package com.wipro.ass;

public class NestedCatch {
	
	public static void main(String[] args) {
		try{
			int a = 5/0;
		} catch(ArithmeticException e) {
			System.out.println("Arithmatic");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		} catch (Throwable t) {
			System.out.println("Throwable");
			t.printStackTrace();
		}
	}

}
