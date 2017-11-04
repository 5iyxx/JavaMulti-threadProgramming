package com.eric.multithreading.interrupt;

public class InterruptedRun1 {

	public static void main(String[] args) {
		try {
			InterruptThread thread=new InterruptThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
			//Thread.currentThread().interrupt();
			System.out.println("ÊÇ·ñÍ£Ö¹1£¿="+thread.interrupted());

			System.out.println("ÊÇ·ñÍ£Ö¹2£¿="+thread.interrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}
