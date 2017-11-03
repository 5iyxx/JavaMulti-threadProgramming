package com.eric.multithreading.isAlive;

public class IsAliveRun {

	public static void main(String[] args) throws InterruptedException {
		MyIsAlive myIsAlive=new MyIsAlive();
        System.out.println("begin=="+myIsAlive.isAlive());
        myIsAlive.start();
        Thread.sleep(1000);
        System.out.println("end=="+myIsAlive.isAlive());
        
	}
}
