package com.eric.multithreading.interrupt;

public class InterruptedRun1 {

	public static void main(String[] args) {
		try {
			System.out.println(Thread.currentThread().getId());
			InterruptThread thread=new InterruptThread();
			thread.start();
			Thread.sleep(100);
			thread.interrupt();
			//Thread.currentThread().interrupt();
			System.out.println("�Ƿ�ֹͣ1��="+thread.interrupted()+thread.currentThread().getId());

			System.out.println("�Ƿ�ֹͣ2��="+thread.interrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}
