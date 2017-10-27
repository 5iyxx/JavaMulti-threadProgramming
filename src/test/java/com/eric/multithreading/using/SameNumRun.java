package com.eric.multithreading.using;

import com.eric.multithreading.SameNum;

public class SameNumRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SameNum thread=new SameNum();
		Thread a=new Thread(thread);
		Thread b=new Thread(thread);
		Thread c=new Thread(thread);
		Thread d=new Thread(thread);
		Thread e=new Thread(thread);
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
}
