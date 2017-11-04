package com.eric.multithreading.interrupt;

public class StopRun {

	public static void main(String[] args) {
		try {
			StopThread thread = new StopThread();
			thread.start();
			Thread.sleep(8000);
			thread.stop();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
