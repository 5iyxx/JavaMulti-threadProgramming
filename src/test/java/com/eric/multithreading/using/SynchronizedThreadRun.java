package com.eric.multithreading.using;

import com.eric.multithreading.SynchronizedThread;

public class SynchronizedThreadRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SynchronizedThread thread=new SynchronizedThread();
		Thread a=new Thread(thread,"A");
		Thread b=new Thread(thread,"B");
		Thread c=new Thread(thread,"C");
		Thread d=new Thread(thread,"D");
		Thread e=new Thread(thread,"E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
}
