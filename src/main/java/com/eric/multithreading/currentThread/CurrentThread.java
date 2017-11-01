package com.eric.multithreading.currentThread;

public class CurrentThread extends Thread {

	public CurrentThread(){
		System.out.println("构造方法的打印:"+Thread.currentThread().getName());
	}
	public void run(){
		System.out.println("Run方法的打印:"+Thread.currentThread().getName());
	}
}
