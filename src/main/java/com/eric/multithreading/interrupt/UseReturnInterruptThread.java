package com.eric.multithreading.interrupt;

public class UseReturnInterruptThread extends Thread {

	@Override
	public void run() {

		while(true){
			if(this.isInterrupted()){
				System.out.println("ֹͣ�ˣ�");
				return;
			}
			System.out.println("time="+System.currentTimeMillis());
		}
	}
}
