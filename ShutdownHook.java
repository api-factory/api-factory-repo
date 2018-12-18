package com.wipro.ass;


class T extends Thread {
	@Override
	public void run() {
		System.out.println("shutdown hook");
	}
}
public class ShutdownHook {
	public static void main(String[] args) {
		T t = new T();
		
		Runtime run = Runtime.getRuntime();
		run.addShutdownHook(t);
		
		System.out.println("Press ctrl+c to enter in shutdown hook before 5 mins. After 5 mins main will terminate.");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
