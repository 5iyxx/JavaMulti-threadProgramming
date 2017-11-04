package com.eric.multithreading.interrupt;

public class UseReturnInterruptRun {

	public static void main(String[] args) throws InterruptedException {
		UseReturnInterruptThread t = new UseReturnInterruptThread();
		t.start();
		Thread.sleep(2000);
		t.interrupt();
	}
}
