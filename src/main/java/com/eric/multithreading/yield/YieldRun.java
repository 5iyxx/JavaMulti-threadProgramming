package com.eric.multithreading.yield;

public class YieldRun {

	public static void main(String[] args) {
		YieldThread thread=new YieldThread();
		thread.start();
	}
}
