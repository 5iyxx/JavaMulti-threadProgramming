package com.eric.multithreading.interrupt;

public class SynchronizedStopThread extends Thread {

	private SynchronizedObject object;

	public SynchronizedStopThread(SynchronizedObject object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		object.printString("b", "bb");
	}
}
