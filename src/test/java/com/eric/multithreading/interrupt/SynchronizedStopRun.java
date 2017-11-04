package com.eric.multithreading.interrupt;

public class SynchronizedStopRun {

	public static void main(String[] args) {
		try {
			SynchronizedObject object=new SynchronizedObject();
			SynchronizedStopThread thread=new SynchronizedStopThread(object);
			thread.start();
			Thread.sleep(500);
			thread.stop();
			System.out.println(object.getUsername()+" "+object.getPassword());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
