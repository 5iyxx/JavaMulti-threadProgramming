package com.eric.multithreading.currentThread;

public class CountOperateRun {

	public static void main(String[] args) {
		CountOperate c=new CountOperate();
		Thread t1=new Thread(c);
		t1.setName("A");
        t1.start();
	}
}
