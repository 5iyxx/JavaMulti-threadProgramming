package com.eric.multithreading.isAlive;

public class IsAliveOperateRun {

	public static void main(String[] args) {
		IsAliveOperate c=new IsAliveOperate();
		Thread t=new Thread(c);
		System.out.println("main begin t isAlive = "+t.isAlive());
		t.setName("A");
        t.start();
       System.out.println("main end t isAlive = "+t.isAlive());
	}
}
