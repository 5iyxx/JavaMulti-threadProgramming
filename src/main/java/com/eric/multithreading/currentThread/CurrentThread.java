package com.eric.multithreading.currentThread;

public class CurrentThread extends Thread {

	public CurrentThread(){
		System.out.println("���췽���Ĵ�ӡ:"+Thread.currentThread().getName());
	}
	public void run(){
		System.out.println("Run�����Ĵ�ӡ:"+Thread.currentThread().getName());
	}
}
