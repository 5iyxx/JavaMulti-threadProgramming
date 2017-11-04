package com.eric.multithreading.interrupt;

public class ErrorInterruptThread2 extends Thread {

	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 500000; i++) {
				if (this.interrupted()) {
					System.out.println("已经是停止状态了！我要退出！");
					throw new InterruptedException();
				}
				System.out.println("i=" + (i + 1));

			}
			System.out.println("我在for下面");
		} catch (InterruptedException e) {
			System.out.println("进ErrorInterruptThread2.java类run方法中的catch了！");
			e.printStackTrace();
		}
	}
}
