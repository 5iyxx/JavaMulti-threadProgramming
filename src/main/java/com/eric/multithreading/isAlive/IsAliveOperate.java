package com.eric.multithreading.isAlive;

public class IsAliveOperate extends Thread {

	public IsAliveOperate(){
		System.out.println("IsAliveOperate---begin");
		System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());
		System.out.println("this.getName()="+ this.getName());
		System.out.println("this.isAlive()="+ this.isAlive());
		System.out.println("IsAliveOperate---end");
	}

	@Override
	public void run() {
		System.out.println("run---begin");
		System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());
		System.out.println("this.getName()="+ this.getName());
		System.out.println("this.isAlive()="+ this.isAlive());
		System.out.println("run---end");
	}	
}
