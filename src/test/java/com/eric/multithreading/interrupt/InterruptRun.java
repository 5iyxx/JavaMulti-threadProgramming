package com.eric.multithreading.interrupt;

public class InterruptRun {

	public static void main(String[] args) {

		try {
			InterruptThread thread=new InterruptThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("main catch");
			e.printStackTrace();
		}
	}

}
