package com.eric.multithreading.interrupt;

public class SleepRun {

	public static void main(String[] args) {
		try {
			SleepThread thread = new SleepThread();
			thread.start();
			Thread.sleep(200);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
