package com.eric.multithreading.using;

public class SameNum extends Thread {

	private int i=5;
	public void run(){
		System.out.println("i="+(i--)+" threadName="+ Thread.currentThread().getName());
	  /*
		*��Ҫ������i--��ǰ����Ŀ�е���һ�иĳ��ڵ�ǰ��Ŀ����println()������ֱ�ӽ��д�ӡ
	    */
	}
}
