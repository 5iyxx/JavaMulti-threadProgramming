package com.eric.multithreading.interrupt;

public class ErrorInterruptRu2 {

	public static void main(String[] args) {

		try {
			ErrorInterruptThread2  thread = new ErrorInterruptThread2();
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
