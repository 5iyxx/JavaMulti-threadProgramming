package com.eric.multithreading.using;

public class SynchronizedThread extends Thread {
	private int count = 5;

	synchronized public void run() {
		super.run();
		count--;
		System.out.println("”…" + this.currentThread().getName() + "º∆À„£¨count=" + count);

	}
}
