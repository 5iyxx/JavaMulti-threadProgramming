package com.eric.multithreading.using;

public class ShareThread extends Thread {

	private int count=5;
	public void run(){
		super.run();
		count--;
		//此示例不要用for语句，因为使用后其他线程就得不到运行的机会了
		//一直由一个线程进行减法运算
		System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
	}
}
