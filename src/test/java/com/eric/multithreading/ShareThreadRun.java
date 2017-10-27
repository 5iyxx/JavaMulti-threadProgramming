package com.eric.multithreading;

public class ShareThreadRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShareThread thread=new ShareThread();
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
