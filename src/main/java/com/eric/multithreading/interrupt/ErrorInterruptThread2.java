package com.eric.multithreading.interrupt;

public class ErrorInterruptThread2 extends Thread {

	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 500000; i++) {
				if (this.interrupted()) {
					System.out.println("�Ѿ���ֹͣ״̬�ˣ���Ҫ�˳���");
					throw new InterruptedException();
				}
				System.out.println("i=" + (i + 1));

			}
			System.out.println("����for����");
		} catch (InterruptedException e) {
			System.out.println("��ErrorInterruptThread2.java��run�����е�catch�ˣ�");
			e.printStackTrace();
		}
	}
}
