package com.eric.multithreading.interrupt;

public class UseReturnInterruptThread extends Thread {

	@Override
	public void run() {

		while(true){
			if(this.isInterrupted()){
				System.out.println("Õ£÷π¡À£°");
				return;
			}
			System.out.println("time="+System.currentTimeMillis());
		}
	}
}
