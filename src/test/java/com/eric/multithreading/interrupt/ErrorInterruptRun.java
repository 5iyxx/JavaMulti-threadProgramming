package com.eric.multithreading.interrupt;

public class ErrorInterruptRun {

	public static void main(String[] args) {

		try {
			ErrorInterruptThread thread = new ErrorInterruptThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
