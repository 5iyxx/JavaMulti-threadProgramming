package com.eric.multithreading.suspend;

public class SuspendResumeRun {
	public static void main(String[] args) {
		try {
			SuspendResumeThread thread = new SuspendResumeThread();
			thread.start();
			Thread.sleep(5000);
			// A¶Î
			thread.suspend();
			System.out.println("A= " + System.currentTimeMillis() + " i=" + thread.getI());
			Thread.sleep(5000);
			System.out.println("A= " + System.currentTimeMillis() + " i=" + thread.getI());
			// B¶Î
			thread.resume();
			thread.sleep(5000);
			// c¶Î
			thread.suspend();
			System.out.println("B= " + System.currentTimeMillis() + " i=" + thread.getI());
			Thread.sleep(5000);
			System.out.println("B= " + System.currentTimeMillis() + " i=" + thread.getI());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
