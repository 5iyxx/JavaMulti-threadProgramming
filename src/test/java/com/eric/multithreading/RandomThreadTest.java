package com.eric.multithreading;

public class RandomThreadTest {

	public static void main(String[] args) {
		try {
			RandomThread thread = new RandomThread();
			thread.setName("myThread");
			thread.start();
			for (int i = 0; i < 10; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("main=" + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
