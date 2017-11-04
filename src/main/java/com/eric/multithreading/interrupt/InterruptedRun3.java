package com.eric.multithreading.interrupt;

public class InterruptedRun3 {

	public static void main(String[] args) {
		try {
			InterruptThread thread=new InterruptThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			//Thread.currentThread().interrupt();
			System.out.println("ÊÇ·ñÍ£Ö¹1£¿="+thread.isInterrupted());
			System.out.println("ÊÇ·ñÍ£Ö¹2£¿="+thread.isInterrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}
