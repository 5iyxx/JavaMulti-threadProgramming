package com.eric.multithreading.using;

public class UnshareThread extends Thread {

	private int count = 5;

	public UnshareThread(String name) {
		super();
		this.setName(name);
	}

	public void run() {
		super.run();
		while (count > 0) {
			count--;
			System.out.println("”…" + this.currentThread().getName() + "º∆À„£¨count=" + count);
		}
	}
}
