package com.eric.multithreading.isAlive;

public class MyIsAlive extends Thread {

	@Override
	public void run() {
		System.out.println("run=" + this.isAlive());
	}
}
