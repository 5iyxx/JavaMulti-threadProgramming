package com.eric.multithreading.sleep;

public class SleepRun2 {

	public static void main(String[] args) {
		SleepThread2 t=new SleepThread2();
		System.out.println("begin ="+System.currentTimeMillis());
        t.start();
        System.out.println("end="+System.currentTimeMillis());
	}
}
