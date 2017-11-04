package com.eric.multithreading.interrupt;

public class SleepThread extends Thread {

	@Override
	public void run() {
		super.run();
		try {
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("�ڳ�˯�б�ֹͣ������catch��"+this.isInterrupted());
			e.printStackTrace();
		}
	}
}
