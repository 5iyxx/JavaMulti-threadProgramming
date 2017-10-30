package com.eric.multithreading.using;

public class SameNum extends Thread {

	private int i=5;
	public void run(){
		System.out.println("i="+(i--)+" threadName="+ Thread.currentThread().getName());
	  /*
		*主要：代码i--由前面项目中单独一行改成在当前项目中在println()方法中直接进行打印
	    */
	}
}
