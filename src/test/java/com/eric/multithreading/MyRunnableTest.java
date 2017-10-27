package com.eric.multithreading;

public class MyRunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable runnable=new MyRunnable();
		Thread thread=new Thread(runnable);
		thread.start();
		System.out.println("ÔËĞĞ½áÊø£¡");
	}
}
