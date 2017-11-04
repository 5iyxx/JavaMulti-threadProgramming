package com.eric.multithreading.sleep;

public class SleepRun1 {

	public static void main(String[] args) {
		SleepThread1 t=new SleepThread1();
		System.out.println("begin ="+System.currentTimeMillis());
        t.run();
        System.out.println("end="+System.currentTimeMillis());
	}
}
