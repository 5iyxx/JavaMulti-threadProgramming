package com.eric.multithreading.interrupt;

public class StopDeathThread extends Thread {

	@Override
	public void run() {
		try{
		this.stop();
		}catch(ThreadDeath e){
			System.out.println("������catch()������");
			e.printStackTrace();
		}
	}
}
