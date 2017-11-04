package com.eric.multithreading.interrupt;

public class SleepRun2 {

	public static void main(String[] args) {

			SleepThread2 thread = new SleepThread2();
			thread.start();
             thread.interrupt();
		System.out.println("end!");
	}
}
