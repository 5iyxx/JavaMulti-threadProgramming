package com.eric.multithreading.using;

import com.eric.multithreading.using.UnshareThread;

public class NushareThreadRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UnshareThread a=new UnshareThread("A");
		UnshareThread b=new UnshareThread("B");
		UnshareThread c=new UnshareThread("C");
		a.start();
		b.start();
		c.start();
	}
}
